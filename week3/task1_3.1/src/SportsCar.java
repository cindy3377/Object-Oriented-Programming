public class SportsCar extends Car {
    private static final float ACCELERATION_FACTOR = 20;
    private static final float DECELERATION_FACTOR = 15;
    private static final float GASOLINE_CONSUMPTION_RATE = 2;
    public SportsCar(String typeName, float gasolineLevel, float topSpeed) {
        super(typeName, gasolineLevel, topSpeed);
    }
    @Override
    public void accelerate() {
        if (gasolineLevel > 0) {
            speed += ACCELERATION_FACTOR;
        } else
            speed = 0;
        gasolineLevel -= GASOLINE_CONSUMPTION_RATE;
    }
    @Override
    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0) {
                speed = Math.max(0, speed - Math.min(amount, DECELERATION_FACTOR));
            } else
                speed = 0;
            gasolineLevel -= GASOLINE_CONSUMPTION_RATE;
        }
    }
}
