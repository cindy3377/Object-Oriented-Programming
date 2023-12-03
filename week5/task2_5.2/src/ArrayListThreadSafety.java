public class ArrayListThreadSafety {
    public static void main(String[] args) {
        SafeArrayList<String> safeArrayList = new SafeArrayList<>();
        Thread[] threads = new Thread[3];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new ArrayListTester(safeArrayList));
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final ArrayList Size: " + safeArrayList.getSize());
    }
}
