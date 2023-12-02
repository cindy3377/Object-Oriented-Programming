class SumCalculator extends Thread {
    private int[] numbers;
    private int start;
    private int end;
    private long partialSum;

    public SumCalculator(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialSum += numbers[i];
        }
        System.out.println("Partial Sum from thread " + Thread.currentThread().getId() + ": " + partialSum);
    }

    public long getPartialSum() {
        return partialSum;
    }
}

