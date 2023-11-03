public class CarDriver {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", 60.0f, 140.0f, 0.0f, 180.0f);

        myCar.accelerate();
        System.out.println("Speed: " + myCar.getSpeed());

        myCar.decelerate(10);
        System.out.println("Speed after deceleration: " + myCar.getSpeed());

        myCar.fillTank();
        System.out.println("Gasoline level: " + myCar.getGasolineLevel());

        System.out.println("Car type: " + myCar.getTypeName());
        System.out.println("Top speed: " + myCar.getTopSpeed());

        myCar.setTargetSpeed(190.0f);
        boolean cruiseControlEnabled = myCar.turnOnCruiseControl();

        if (cruiseControlEnabled) {
            System.out.println("Cruise control is ON. Target speed: " + myCar.getTargetSpeed());
        } else {
            System.out.println("Cruise control cannot be turned on. Target speed is unreachable.");
        }

        myCar.adjustSpeedWithCruiseControl();
        System.out.println("Speed with cruise control: " + myCar.getTargetSpeed());

        myCar.turnOffCruiseControl();
        System.out.println("Cruise control is OFF.");
    }
}
