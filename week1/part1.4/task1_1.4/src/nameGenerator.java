import java.util.Scanner;
import java.security.SecureRandom;

public class nameGenerator {
    private SecureRandom randomNumbers = new SecureRandom();
    public void createName() {
        String [] lastNameArray = {"Claus", "Jackson", "Davidson"};
        String [] firstNameArray = {"Harri", "Micheal", "Santa"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many full name do you want to create?");
        int nameAmount = scanner.nextInt();
        System.out.println("The randomly generated names are:");
        for (int i = 0; i < nameAmount; i++) {
            int digit1 = randomNumbers.nextInt(3);
            int digit2 = randomNumbers.nextInt(3);
            String firstName = firstNameArray[digit1];
            String lastName = lastNameArray[digit2];
            String fullName = firstName + " " + lastName;
            System.out.println(fullName);
        }
    }
    public static void main(String[] args) {
        nameGenerator nameCreator = new nameGenerator();
        nameCreator.createName();
    }
}
