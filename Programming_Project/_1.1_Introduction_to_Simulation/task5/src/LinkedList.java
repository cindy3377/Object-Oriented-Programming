
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
                        Thread.sleep(serviceTime); // Simulate service time
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    customer.setEndTime(System.nanoTime() + serviceTime);
                    long timeSpentInQueue = customer.getTimeSpentInQueue();
                    System.out.println("Customer " + customer.getId() + " served.  " + timeSpentInQueue + " nanoseconds in the queue. Service time: " + serviceTime + " nanoseconds.");
                }
            }
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
