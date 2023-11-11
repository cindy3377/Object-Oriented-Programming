import org.w3c.dom.UserDataHandler;

public class Shape {
    private String color;
    public Shape(String color) {
        this.color = color;
    }
    public double calculateArea() {
        return 0;
    }

    public String getColor() {
        return color;
    }

}
class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color) {
        super(color);
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

    public Rectangle(double width, double height, String color) {
        super(color);
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

    public Triangle(double base, double height, String color) {
        super(color);
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
        shapes[0] = new Circle(5.0, "Red");
        shapes[1] = new Rectangle(4.0, 7.0, "Blue");
        shapes[2] = new Triangle(3.0, 8.0, "Green");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Area of Circle with radius " + ((Circle) shape).getRadius() + " and color " + shape.getColor() + ": " + shape.calculateArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Area of Rectangle with width " + ((Rectangle) shape).getWidth() + " and height " + ((Rectangle) shape).getHeight() + " and color " + shape.getColor() +": " + shape.calculateArea());
            } else if (shape instanceof Triangle) {
                System.out.println("Area of Triangle with base " + ((Triangle) shape).getBase() + " and height " + ((Triangle) shape).getHeight() + " and color " + shape.getColor() + ": " + shape.calculateArea());
            }
        }
    }
}
