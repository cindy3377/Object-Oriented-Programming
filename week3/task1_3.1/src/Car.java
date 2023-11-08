public class Car {
    public float speed;
    public float gasolineLevel;
    public float topSpeed;
    public String typeName;

    public Car(String typeName, float gasolineLevel, float topSpeed) {
        speed = 0;
        this.gasolineLevel = gasolineLevel;
        this.topSpeed = topSpeed;
        this.typeName = typeName;
    }

    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    public void decelerate(int amount) {
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
        return topSpeed;
    }
}
