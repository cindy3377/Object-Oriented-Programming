public class Car {
    private String typeName;
    private float speed;
    private float topSpeed;
    private float gasolineLevel;

    private float minCruiseSpeed;
    private float maxCruiseSpeed;
    private float targetSpeed;
    private boolean cruiseControlOn;

    public Car(String typeName, float speed, float topSpeed, float minSpeed, float maxSpeed) {
        this.typeName = typeName;
        this.speed = speed;
        this.topSpeed = topSpeed;
        this.gasolineLevel = 0.0f;

        this.minCruiseSpeed = minSpeed;
        this.maxCruiseSpeed = maxSpeed;
        this.targetSpeed = 0.0f;
        this.cruiseControlOn = false;
    }

    public void accelerate() {
        if (speed < topSpeed) {
            speed += 5.0f;
        }
    }

    public void decelerate(float rate) {
        if (speed - rate >= 0) {
            speed -= rate;
        } else {
            speed = 0;
        }
    }

    public void fillTank() {
        gasolineLevel = 100.0f;
    }

    public String getTypeName() {
        return typeName;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getSpeed() {
        return speed;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void setTargetSpeed(float speed) {
        if (speed >= minCruiseSpeed && speed <= maxCruiseSpeed) {
            this.targetSpeed = speed;
        } else {
            System.out.println("Invalid target speed. It must be between " + minCruiseSpeed + " and " + maxCruiseSpeed + ".");
        }
    }

    public float getTargetSpeed() {
        return targetSpeed;
    }

    public boolean turnOnCruiseControl() {
        if (targetSpeed > 0) {
            cruiseControlOn = true;
            return true;
        } else {
            System.out.println("Cruise control cannot be turned on. Set a valid target speed first.");
            return false;
        }
    }

    public void turnOffCruiseControl() {
        cruiseControlOn = false;
    }

    public void adjustSpeedWithCruiseControl() {
        if (cruiseControlOn) {
            if (targetSpeed > getSpeed()) {
                accelerate();
            } else if (targetSpeed < getSpeed()) {
                decelerate(5);
            }
        }
    }
}
