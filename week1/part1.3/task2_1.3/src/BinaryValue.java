import java.util.Scanner;
public class BinaryValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binaryInput = scanner.next();

        int decimal = binaryToDecimal(binaryInput);
        System.out.println("Converted decimal value: " + decimal);
        scanner.close();
    }

    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int length = binary.length();

        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(i);
            if (bit == '0') {
                decimal = decimal * 2;
            } else if (bit == '1') {
                decimal = decimal * 2 + 1;
            } else {
                System.out.println("Invalid binary input.");
                System.exit(1);
            }
        }
        return decimal;
    }

}