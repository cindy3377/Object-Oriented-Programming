import java.util.Scanner;

public class DuplicateRemove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the integers into the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Create a new array to store the unique values
        int[] uniqueArray = new int[size];
        int uniqueSize = 0;

        // Iterate through the original array and add unique elements to the new array
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueSize; j++) {
                if (array[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                uniqueArray[uniqueSize] = array[i];
                uniqueSize++;
            }
        }

        // Print the resulting array without duplicates
        System.out.println("\nThe array without duplicates:");
        for (int i = 0; i < uniqueSize; i++) {
            System.out.print(uniqueArray[i] + " ");
        }
    }
}
