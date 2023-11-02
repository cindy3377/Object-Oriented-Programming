public class Car {
    private float speed;
    private float gasolineLevel;
    private float topSpeed;
    private String typeName;
    public Car(String typeName, float gasolineCapacity, float topSpeed) {
        speed = 0;
        gasolineLevel = gasolineCapacity;
        this.topSpeed = topSpeed;
        this.typeName = typeName;

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    float getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = 100;
    }
    float getGasolineLevel() {
        return gasolineLevel;
    }

    float getTopSpeed() {
        return topSpeed
        }
}