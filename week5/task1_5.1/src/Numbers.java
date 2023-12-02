public class Numbers extends Thread {

    private int start;
    private int end;

    public Numbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i += 2) {
            if (Thread.currentThread().getName().equals("odd number") && i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            } else if (Thread.currentThread().getName().equals("even number") && i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                ;
            }
        }
    }
}
