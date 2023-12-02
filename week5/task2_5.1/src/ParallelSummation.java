public class ParallelSummation {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numThreads = 2;

        SumCalculator[] calculators = new SumCalculator[numThreads];
        int chunkSize = numbers.length / numThreads;

        for (int i = 0; i < numThreads; i++) {
            int start = i * chunkSize;
            int end = (i == numThreads - 1) ? numbers.length - 1 : start + chunkSize - 1;

            calculators[i] = new SumCalculator(numbers, start, end);
            calculators[i].start();
        }

        try {
            for (SumCalculator calculator : calculators) {
                calculator.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = 0;
        for (SumCalculator calculator : calculators) {
            totalSum += calculator.getPartialSum();
        }

        System.out.println("Total Sum: " + totalSum);
    }
}