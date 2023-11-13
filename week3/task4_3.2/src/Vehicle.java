public interface Vehicle {
    void starting();
    void stopping();
    String gettingInfo();
    double calculateFuelEfficiency();
}
abstract class AbstractVehicle implements Vehicle {
    protected String fuel;
    public AbstractVehicle(String fuel){
        this.fuel = fuel;
    }
    @Override
    public abstract void starting();
    @Override
    public void stopping() {
        System.out.println("Vehicle is stopping...");
    }
    @Override
    public abstract String gettingInfo();
    @Override
    public abstract double calculateFuelEfficiency();
}
class Car extends AbstractVehicle {
    private String color;
    private double fuelConsumed;
    private double distance;
    public Car(String fuel, String color, double fuelConsumed, double distance) {
        super(fuel);
        this.color = color;
        this.fuelConsumed = fuelConsumed;
        this.distance = distance;
    }
    @Override
    public void starting(){
        System.out.println("Car is starting...");
    }
    @Override
    public void stopping(){
        System.out.println("Car is stopping...");
    }
    @Override
    public String gettingInfo() {
        return "Type: Car\nFuel: " + fuel + "\nColor " + color;
    }
    @Override
    public double calculateFuelEfficiency() {
        return fuelConsumed/distance;
    }
}


class Motorcycle extends AbstractVehicle {
    private String color;
    private double fuelConsumed;
    private double distance;
    public Motorcycle(String fuel, String color, double fuelConsumed, double distance) {
        super(fuel);
        this.color = color;
        this.fuelConsumed = fuelConsumed;
        this.distance = distance;
    }
    @Override
    public void starting(){
        System.out.println("\nMotorcycle is starting...");
    }
    @Override
    public void stopping(){
        System.out.println("Motorcycle is stopping...");
    }
    @Override
    public String gettingInfo() {
        return "Type: Motorcycle\nFuel: " + fuel + "\nColor " + color;
    }
    @Override
    public double calculateFuelEfficiency() {
        return fuelConsumed/distance;
    }
}
class VehicleImplementation {
    public static void main (String [] args) {
        Vehicle car = new Car("Petrol", "Red", 30, 320);
        car.starting();
        car.stopping();
        System.out.println("\nCar Information:\n" + car.gettingInfo() + "\n");
        System.out.printf("Car consumed %s liter per kilometer.%n", car.calculateFuelEfficiency());

        Vehicle motorcycle = new Motorcycle("Diesel", "Blue", 25, 300);
        motorcycle.starting();
        motorcycle.stopping();
        System.out.println("\nMotorcycle Information:\n" + motorcycle.gettingInfo() + "\n");
        System.out.printf("Motorcycle consumed %s liter per kilometer.%n", motorcycle.calculateFuelEfficiency());
    }
}