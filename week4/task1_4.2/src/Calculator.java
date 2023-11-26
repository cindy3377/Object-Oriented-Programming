public class Calculator {
    private int value;

    // Method to reset the calculator to zero.
    public void reset() {
        value = 0;
    }

    // Method to add an integer to the calculator.
    public void add(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative integers are not allowed");
        }
        value += num;
    }

    // Method to return the current value of the calculator.
    public int getValue() {
        return value;
    }

    // Temporary main method for testing.
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
        calculator.add(3);

        System.out.println("Current value: " + calculator.getValue());
    }
}
