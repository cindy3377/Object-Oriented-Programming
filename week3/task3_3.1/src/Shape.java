import org.w3c.dom.UserDataHandler;

public class Shape {
    public double calculateArea() {
        return 0;
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    } public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public double getHeight() {
        return height;
    }
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}
class ShapeCalculator {
    public static void main(String[] args) {
        System.out.println("Shape Calculator\n");
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 7.0);
        shapes[2] = new Triangle(3.0, 8.0);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of Circle with radius " + ((Circle) shape).getRadius() + ": " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area of Rectangle with width " + ((Rectangle) shape).getWidth() + " and height" + ((Rectangle) shape).getHeight() +": " + shape.calculateArea());
            } else if (shape instanceof Triangle) {
                System.out.println("Area of Triangle with base " + ((Triangle) shape).getBase() + " and height " + ((Triangle) shape).getHeight() + ": " + shape.calculateArea());
            }
        }
    }
}
