public class Bus extends Car {
    private int passengerCount;
    private int maxPassengerCapacity;
    public Bus (String typeName, float gasolineLevel, float topSpeed, int maxPassengerCapacity) {
        super(typeName, gasolineLevel, topSpeed);
        this.passengerCount = 0;
        this.maxPassengerCapacity = maxPassengerCapacity;
    }
    public void passengerEnter(int count) {
        if (count > 0 && passengerCount + count <= maxPassengerCapacity) {
            passengerCount += count;
            System.out.println("There're " + count + " people boarding.");
        } else
            System.out.println("Unable to board passengers. Bus is already full.");
    }
    public void passengerExit(int count) {
        if (count > 0 && count <= passengerCount) {
            passengerCount -= count;
            System.out.println("There're " + count + " people exit.");

        } else {
            System.out.println("Invalid passenger exit request.");
        }
    }
    public int getPassengerCount() {
        System.out.println("Number of passenger on bus: " + passengerCount);
        return passengerCount;
    }
}

class BusTest {
    public static void main(String[] args) {

        Bus bus = new Bus("Mescedes", 100, 120, 45);
        bus.accelerate();
        bus.accelerate();
        System.out.println("Speed: " + bus.getSpeed());
        System.out.println("Current speed: " + bus.getSpeed());
        bus.accelerate();
        System.out.println("Accelerating...");
        System.out.println("Current speed: " + bus.getSpeed());

        bus.decelerate(10);
        System.out.println("Decelerating by 10...");
        System.out.println("Current speed: " + bus.getSpeed());

        // Test filling the tank
        bus.fillTank();
        System.out.println("Filling the tank...");
        System.out.println("Gasoline level: " + bus.getGasolineLevel());

        // Test exceeding top speed
        while (bus.getSpeed() < bus.getTopSpeed()) {
            bus.accelerate();
        }
        System.out.println("Exceeded top speed. Current speed: " + bus.getSpeed());
        bus.getPassengerCount();
        bus.passengerEnter(12);
        bus.getPassengerCount();
        bus.passengerExit(5);
        bus.getPassengerCount();

    }
}

