interface Vehicle {

    void starting();
    void stopping();
    String gettingInfo();
}


class Car implements Vehicle {
    private String fuel;
    private String color;

    public Car( String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }
    @Override
    public void starting() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stopping() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String gettingInfo() {
        return "Type: Car\nFuel: " + fuel + "\nColor: " + color;
    }
}

class Motorcycle implements Vehicle {
    private String fuel;
    private String color;

    public Motorcycle( String fuel, String color) {
        this.fuel = fuel;
        this.color = color;
    }
    @Override
    public void starting() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stopping() {
        System.out.println("Motorcycle is stopping...");
    }

    @Override
    public String gettingInfo() {
        return "Type: Motorcycle\nFuel: " + fuel + "\nColor: " + color;
    }
}


class Bus implements Vehicle {
    private String fuel;
    private int capacity;

    public Bus( String fuel, int capacity) {
        this.fuel = fuel;
        this.capacity = capacity;
    }
    @Override
    public void starting() {
        System.out.println("Bus is starting...");
    }

    @Override
    public void stopping() {
        System.out.println("Bus is stopping...");
    }

    @Override
    public String gettingInfo() {
        return "Type: Bus\nFuel: " + fuel + "\nCapacity: " + capacity;
    }
}
public class VehicleImplementation {
    public static void main (String [] args) {
        Vehicle car = new Car("Petrol", "Red");
        car.starting();
        car.stopping();
        System.out.println("\nCar Information:\n" + car.gettingInfo() + "\n");

        Vehicle motorcycle = new Motorcycle("Gasoline", "Black");
        motorcycle.starting();
        motorcycle.stopping();
        System.out.println("\nMotorcycle Information:\n" + motorcycle.gettingInfo() + "\n");

        Vehicle bus = new Bus("Diesel", 40);
        bus.starting();
        bus.stopping();
        System.out.println("\nBus Information:\n" + bus.gettingInfo());

    }
}