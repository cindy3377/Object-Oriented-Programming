
public class Customer {
    private static int nextId = 1 ;
    private int id;
    private long startTime;
    private long endTime;

    public Customer () {
        this.id = nextId++;
        this.startTime = System.currentTimeMillis();
        this.endTime = 0;
    }
    public Customer (int id, long startTime, long endTime) {
        this.id = id;
        this.startTime = System.currentTimeMillis();
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

    public long getEndTime () {
       return endTime;
    }

    public long getTimeSpent() {
        if (endTime == 0) {
            return System.currentTimeMillis() -startTime;
        }else {
            return endTime - startTime;
        }
    }
    public static void main(String[] args) {
        Customer customer1 = new Customer();

        Customer customer2 = new Customer(30,01012023, 01022023);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        customer1.setEndTime(System.currentTimeMillis());
        System.out.println("Customer " + customer1.getId() + " spent " + customer1.getTimeSpent() + "milliseconds.");
        System.out.println("Customer " + customer2.getId() + " spent " + customer2.getTimeSpent() + "milliseconds.");
    }
}


