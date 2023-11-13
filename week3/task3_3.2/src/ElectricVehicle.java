public interface ElectricVehicle {
    void starting();
    void stopping();
    String gettingInfo();
    void charge();
}
abstract class AbstractVehicle implements ElectricVehicle {
    protected String fuel;
    public AbstractVehicle(String fuel){
        this.fuel = fuel;
    }
    @Override
    public abstract void starting();
    @Override
    public void stopping() {
        System.out.println("Electric vehicle is stopping...");
    }
    @Override
    public abstract String gettingInfo();
    @Override
    public abstract void charge();
}
class ElectricCar extends AbstractVehicle{
    private String color;
    public ElectricCar(String color) {
        super("Electric");
        this.color = color;
    }
    @Override
    public void starting() {
        System.out.println("Electric car is starting...");
    }
    @Override
    public void stopping() {
        System.out.println("Electric car is stopping...");
    }
    @Override
    public String gettingInfo() {
        return "Type: Electric Car\nFuel: " + fuel + "\nColor: " + color;
    }
    @Override
    public void charge(){
        System.out.println("Charging the electric car...");
    }
}
class VehicleImplementation {
    public static void main (String [] args) {
        ElectricVehicle electricCar = new ElectricCar( "Red");
        electricCar.starting();
        electricCar.stopping();
        System.out.println("\nElectric Car Information:\n" + electricCar.gettingInfo() + "\n");
        electricCar.charge();
    }
}