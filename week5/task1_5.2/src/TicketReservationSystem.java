public class TicketReservationSystem {
    public static void main(String[] args) {
        Theater theater = new Theater(10);
        Thread[] customers = new Thread[15];

        for (int i = 0; i < customers.length; i++) {
            customers[i] = new Thread(new Customer(theater));
            customers[i].start();
        }

        for (Thread customer : customers) {
            try {
                customer.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
