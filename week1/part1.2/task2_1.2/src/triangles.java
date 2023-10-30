import java.util.Scanner;
public class triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the 1st leg length: ");
        double first_leg = scanner.nextDouble();

        System.out.print("Enter the 2nd leg length: ");
        double second_leg = scanner.nextDouble();
        double hypotenuse = Math.sqrt(first_leg * first_leg + second_leg * second_leg);
        System.out.printf("The length of the hypotenuse: %.2f%n", hypotenuse);
    }
}
