import java.io.*;

public class FibonacciGenerator {
    private final static String FILENAME = "fibonacci_sequence.csv";

    public static void main(String[] args) {
        // Generate Fibonacci sequence
        long[] fibonacciSequence = generateFibonacciSequence(100);

        // Write the sequence to a CSV file
        writeFibonacciToCSV(fibonacciSequence);

        // Read and print the content of the CSV file (optional, for verification)
        readAndPrintCSV(FILENAME);
    }

    private static long[] generateFibonacciSequence(int n) {
        long[] sequence = new long[n];
        sequence[0] = 0;
        sequence[1] = 1;

        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }

        return sequence;
    }

    private static void writeFibonacciToCSV(long[] sequence) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILENAME))) {
            for (long number : sequence) {
                writer.println(number);
            }
            System.out.println("Fibonacci sequence has been written to " + FILENAME);
        } catch (IOException e) {
            System.err.println("Error writing to CSV: " + e);
        }
    }

    private static void readAndPrintCSV(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from CSV: " + e);
        }
    }
}
