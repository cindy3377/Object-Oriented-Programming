public class SportsCarTest {
    public static void main(String[] args) {

        SportsCar sportsCar = new SportsCar("Ferrari", 100, 250);
        sportsCar.accelerate();
        System.out.println("Speed: " + sportsCar.getSpeed());
        // Test acceleration
        System.out.println("Current speed: " + sportsCar.getSpeed());
        sportsCar.accelerate();
        System.out.println("Accelerating...");
        System.out.println("Current speed: " + sportsCar.getSpeed());

        // Test deceleration
        sportsCar.decelerate(10);
        System.out.println("Decelerating by 10...");
        System.out.println("Current speed: " + sportsCar.getSpeed());

        // Test filling the tank
        sportsCar.fillTank();
        System.out.println("Filling the tank...");
        System.out.println("Gasoline level: " + sportsCar.getGasolineLevel());

        // Test exceeding top speed
        while (sportsCar.getSpeed() < sportsCar.getTopSpeed()) {
            sportsCar.accelerate();
        }
        System.out.println("Exceeded top speed. Current speed: " + sportsCar.getSpeed());
    }
}
