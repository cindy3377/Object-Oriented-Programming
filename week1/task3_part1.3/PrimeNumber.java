import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the end number: ");
        int end = scanner.nextInt();

        if (start < 2 || end < 2 || start >= end) {
            System.out.println("Invalid input. Make sure start < end and both are positive integers greater than 1.");
            return;
        }

        System.out.println("Prime numbers between " + start + " and " + end + ":");

        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
