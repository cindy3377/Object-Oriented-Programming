public class NumberPrintingDemo {
    public static void main(String[] args) {
        int startRange = 1;
        int endRange = 20;

        Thread oddThread = new Numbers(startRange, endRange);
        Thread evenThread = new Numbers(startRange + 1, endRange);

        oddThread.setName ("odd number");
        evenThread.setName ("even number");

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Printing complete.");
        }
}