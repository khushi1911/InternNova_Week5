abstract class Shape {
    abstract double calculateArea();

    public void displayMessage() {
        System.out.println("Calculating the area of a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);

        circle.displayMessage();
        System.out.printf("Area of Circle: %.2f%n", circle.calculateArea());

        System.out.println();

        rectangle.displayMessage();
        System.out.printf("Area of Rectangle: %.2f%n",
                rectangle.calculateArea());
    }
}