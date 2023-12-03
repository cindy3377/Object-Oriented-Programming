import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Theater {
    private int totalSeats;
    private int availableSeats;
    private Lock lock = new ReentrantLock();

    public Theater(int totalSeats) {
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public void reserveSeats(int customerID, int numSeats) {
        lock.lock();
        try {
            if (numSeats > availableSeats) {
                System.out.println("Customer " + customerID + " couldn't reserve " + numSeats + " tickets.");
            } else {
                availableSeats -= numSeats;
                System.out.println("Customer " + customerID + " reserved " + numSeats + " tickets.");
            }
        } finally {
            lock.unlock();
        }
    }
}

class Customer implements Runnable {
    private static int customerIDCounter = 1;
    private int customerID;
    private Theater theater;

    public Customer(Theater theater) {
        this.customerID = customerIDCounter++;
        this.theater = theater;
    }

    @Override
    public void run() {
        int numSeats = (int) (Math.random() * 5) + 1; // Randomly choose 1 to 5 seats
        theater.reserveSeats(customerID, numSeats);
    }
}

