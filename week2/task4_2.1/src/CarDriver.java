public class CarTest {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Sedan", 60.0f, 160.0f, 0.0f, 200.0f); // Adjust minSpeed and maxSpeed

        // Test the Car object's methods
        myCar.accelerate();
        System.out.println("Speed: " + myCar.getSpeed());

        myCar.decelerate(20);
        System.out.println("Speed after deceleration: " + myCar.getSpeed());

        myCar.fillTank();
        System.out.println("Gasoline level: " + myCar.getGasolineLevel());

        System.out.println("Car type: " + myCar.getTypeName());
        System.out.println("Top speed: " + myCar.getTopSpeed());

        // Test cruise control
        myCar.setTargetSpeed(120.0f); // Set the target speed
        boolean cruiseControlEnabled = myCar.turnOnCruiseControl(); // Attempt to turn on cruise control

        if (cruiseControlEnabled) {
            System.out.println("Cruise control is ON. Target speed: " + myCar.getTargetSpeed());
        } else {
            System.out.println("Cruise control cannot be turned on. Target speed is unreachable.");
        }

        myCar.accelerate(); // Accelerate with cruise control
        System.out.println("Speed with cruise control: " + myCar.getSpeed());

        myCar.turnOffCruiseControl(); // Turn off cruise control
        System.out.println("Cruise control is OFF.");
    }
}
