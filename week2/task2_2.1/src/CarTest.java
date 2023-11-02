public class CarTest {
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Sedan", 60.0f, 160.0f);
        Car anotherCar = new Car("Taycan", 80.0f, 320.0f);

        // Test the Car object's methods
        myCar.accelerate();
        System.out.println("Speed: " + myCar.getSpeed());

        myCar.decelerate(20);
        System.out.println("Speed after deceleration: " + myCar.getSpeed());

        myCar.fillTank();
        System.out.println("Gasoline level: " + myCar.getGasolineLevel());

        System.out.println("Car type: " + myCar.getTypeName());
        System.out.println("Top speed: " + myCar.getTopSpeed());
    }
}
