import java.util.Scanner;

public class measurement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Weight (g): ");
        double weightGrams = scanner.nextDouble();

        // Step 2: Define Conversion Factors
        final double GRAMS_PER_LUOTI = 13.28;
        final int LUOTI_PER_NAULA = 32;
        final int NAULA_PER_LEIVISKA = 20;

        // Step 3: Conversion Logic
        int leiviska = (int) (weightGrams / (NAULA_PER_LEIVISKA * LUOTI_PER_NAULA));
        int remainingWeight = (int) (weightGrams % (NAULA_PER_LEIVISKA * LUOTI_PER_NAULA));
        int naula = remainingWeight / LUOTI_PER_NAULA;
        double luoti = remainingWeight % LUOTI_PER_NAULA;

        // Step 4: Output
        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                weightGrams, leiviska, naula, luoti);

        scanner.close();
    }
}
