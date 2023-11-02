import java.util.Scanner;

public class CoffeeProgram {
    public static void main(String[] args) {
        CoffeeMaker myCoffeeMaker = new CoffeeMaker();
        Scanner scanner = new Scanner(System.in);

        if (!myCoffeeMaker.isOn()) {
            myCoffeeMaker.pressOnOff();
        }

        int coffeeType = getCoffeeTypeFromUser(scanner);
        if (coffeeType != -1) {
            int coffeeAmount = getCoffeeAmountFromUser(scanner);

            if (coffeeAmount != -1) {
                prepareCoffee(myCoffeeMaker, coffeeType, coffeeAmount);
            } else {
                System.out.println("Invalid coffee amount.");
            }
        } else {
            System.out.println("Invalid coffee type. Please choose 1 for normal coffee or 2 for espresso coffee.");
        }

        myCoffeeMaker.pressOnOff();
        scanner.close();
    }

    private static int getCoffeeTypeFromUser(Scanner scanner) {
        System.out.println("Press 1 to choose normal coffee, press 2 to choose espresso coffee:");
        int coffeeType = scanner.nextInt();
        if (coffeeType == 1 || coffeeType == 2) {
            System.out.println("You chose " + (coffeeType == 1 ? "normal" : "espresso") + " coffee.");
            return coffeeType;
        }
        return -1;
    }

    private static int getCoffeeAmountFromUser(Scanner scanner) {
        System.out.println("Please choose coffee amount (10-80 ml): ");
        int coffeeAmount = scanner.nextInt();
        if (coffeeAmount >= 10 && coffeeAmount <= 80) {
            return coffeeAmount;
        }
        return -1;
    }

    private static void prepareCoffee(CoffeeMaker coffeeMaker, int coffeeType, int coffeeAmount) {
        boolean full = false;
        if (!full && coffeeAmount <= 80) {
            for (int j = 10; j <= coffeeAmount; j += 10) {
                System.out.println("Loading: " + j + " ml");
            }
            full = true;
            System.out.println("Your coffee is ready");
            coffeeMaker.selectCoffeeType(coffeeType);
            coffeeMaker.selectAmount(coffeeAmount);
        }
    }
}
