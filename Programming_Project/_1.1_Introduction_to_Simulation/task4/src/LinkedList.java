
import java.util.LinkedList;

class Customer {
    private static int nextId = 1 ;
    private int id;
    private long startTime;
    private long endTime;

    public Customer () {
        this.id = nextId++;
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }

    public int getId() {
        return id;
    }
    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }
    public long getTimeSpentInQueue() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        LinkedList<Customer> customerQueue = new LinkedList<>();
        for (int i = 1; i <= 3; i++) {
            Customer customer = new Customer();
            customerQueue.addFirst(customer);
            System.out.println("Customer " + customer.getId() + " joined the queue.");
        }
        while (!customerQueue.isEmpty()) {
            Customer removedCustomer = customerQueue.removeLast();
            removedCustomer.setEndTime(System.nanoTime());
            long timeSpentInQueue = removedCustomer.getTimeSpentInQueue();
            System.out.println("Customer " + removedCustomer.getId() + " was removed from the queue and spent " + timeSpentInQueue + " nanoseconds in the queue.");
        }
    }
}


