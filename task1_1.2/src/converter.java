import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value in fahrenheit: ");

        double fahrenheitValue = scanner.nextDouble();
        double celsiusValue = (fahrenheitValue - 32) * 5 / 9;

        System.out.println("The result is " + String.format("%.2f", celsiusValue) + " celsius.");
    }
}
