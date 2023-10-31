import java.util.Scanner;

public class MaxSubarraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] integers = new int[size];
        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i+1) + ": ");
            integers[i] = scanner.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int startIdx = 0;
        int endIdx = 0;
        int currentStartIdx = 0;

        for (int i = 0; i < size; i++) {
            currentSum += integers[i];

            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIdx = currentStartIdx;
                endIdx = i;
            }

            if (currentSum < 0) {
                currentSum = 0;
                currentStartIdx = i + 1;
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + (startIdx + 1) + "-" + (endIdx + 1));
    }
}