package oops.abstraction.abstractclass;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double length;
    double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}

public class ShapeSystem {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Area of a Circle: " + circle.calculateArea());

        Shape square = new Square(5);
        System.out.println("Area of a Square: " + square.calculateArea());

        Shape rectangle = new Rectangle(4, 5);
        System.out.println("Area of a Rectangle: " + rectangle.calculateArea());
    }
}
