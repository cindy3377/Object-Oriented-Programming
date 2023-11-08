
import java.util.LinkedList;

class Customer {
    private static int nextId = 1;
    private int id;
    private long startTime;
    private long endTime;

    public Customer() {
        this.id = nextId++;
        this.startTime = System.nanoTime();
        this.endTime = 0;
    }

    public int getId() {
        return id;
    }

    public long getStartTime() {
        return startTime;
    }


    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getEndTime() {
        return endTime;
    }

    public long getTimeSpentInQueue() {
        return endTime - startTime;
    }

}

class ServicePoint {
    private LinkedList<Customer> customerQueue = new LinkedList<>();
    private long totalServiceTime = 0;
    private int numCustomersServed = 0;
    public void addToQueue(Customer customer) {
        customerQueue.add(customer);
    }
    public Customer removeFromQueue() {
        if (!customerQueue.isEmpty()) {
            return customerQueue.removeFirst();
        }
        return null;
    }

    public void serve() {
        while (!customerQueue.isEmpty()) {
            Customer customer = removeFromQueue();
            if (customer != null) {
                long serviceTime = (long) (Math.random() * 1000);
                try {
                    Thread.sleep(serviceTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                totalServiceTime += serviceTime;
                customer.setEndTime(System.nanoTime() + (serviceTime*1000000));
                numCustomersServed++;
                long timeSpentInQueue = customer.getTimeSpentInQueue();
                System.out.println("Customer " + customer.getId() + " served.  " + timeSpentInQueue + " nanoseconds in the queue. Service time: " + serviceTime + " nanoseconds.");
            }
        }
    }
    public double getAverageServiceTime() {
        if (numCustomersServed == 0) {
            return 0.0;
        }
        return (double) totalServiceTime / numCustomersServed;
    }

}
class CustomerGenerator{
    public static void generateCustomers (ServicePoint servicePoint, int numCustomers) {
        for (int i = 0; i < numCustomers; i++) {
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}
class SingleServiceSystem {
    public static void main(String[] args) {
        ServicePoint servicePoint = new ServicePoint();
        int numCustomers = 5;
        CustomerGenerator.generateCustomers(servicePoint, numCustomers);
        servicePoint.serve();
        double averageServiceTime = servicePoint.getAverageServiceTime();
        System.out.println("Average Service Time: " + averageServiceTime + " milliseconds");
    }
}