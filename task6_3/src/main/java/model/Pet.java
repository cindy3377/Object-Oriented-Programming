package model;

public class Pet {
    private double x;
    private double y;
    private static final double SPEED = 3.0;

    public Pet(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void moveTo(double targetX, double targetY) {
        double deltaX = targetX - x;
        double deltaY = targetY - y;
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);

        if (distance > 0) {
            double ratio = SPEED / distance;
            x += ratio * deltaX;
            y += ratio * deltaY;
        }
    }
}
