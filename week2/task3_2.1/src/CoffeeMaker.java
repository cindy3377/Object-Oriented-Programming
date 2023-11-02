public class CoffeeMaker {
    private boolean on;
    private int coffeeAmount;
    private int coffeeType;
    public CoffeeMaker() {
        this.on = false;
        this.coffeeType = 1;
        this.coffeeAmount = 10;
    }
    public void pressOnOff() {
        this.on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int getCoffeeType() {
        return coffeeType;
    }

    public void selectCoffeeType(int type) {
        if (on && (type == 1 || type == 2)) {
            coffeeType = type;
        }
    }
    public int getAmount() {
        return coffeeAmount;
    }

    public void selectAmount(int amount) {
        if (on && amount >= 10 && amount <= 80) {
            coffeeAmount = amount;
        }
    }
}
