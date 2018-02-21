package java.shapes;

import static java.lang.Double.compare;

class Shape implements Comparable<Shape> {
    double area;

    Shape(double area) {
        this.area = area;
    }

    @Override public int compareTo(Shape other) {
        return compare(this.area, other.area);
    }
}

class Square extends Shape {
    Square( double side) {
        super(side * side);
    }
}

class Rectangle extends Shape {
    Rectangle( double height,  double width) {
        super(height * width);
    }
}

class Triangle extends Shape {
    Triangle( double base,  double height) {
        super(height * base / 2.0);
    }
}

class Circle extends Shape {
    Circle( double radius) {
        super(Math.PI * radius * radius);
    }
}

class CustomShape extends Shape {
    CustomShape( double area) {
        super(area);
    }
}

/*

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedShapes {

    List<Shape> shapes = new ArrayList<>();

    public List<Shape> compareShape() {

        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape shape, Shape t1) {
                return Double.compare(shape.area, t1.area);
            }
        });
        return shapes;
    }
}

class Shape {

    double area;
}

class Square extends Shape {

    public Square(double side) {
        area = side * side;
    }
}

class Rectangle extends Shape {

    public Rectangle(double width, double height) {
        area = width * height;
    }
}

class Triangle extends Shape {

    public Triangle(double base, double height) {
        area = base * height / 2;
    }
}

class Circle extends Shape {
    public Circle(double radius) {
        area = Math.PI * radius * radius;
    }
}

class CustomShape extends Shape {
    public CustomShape(double area) {
        this.area = area;
    }
}
*/

/*    Although shapes can be very different by nature, they can be sorted by the size of their area.

        Task:

        Create different shapes that can be part of a sortable list. The sort order is based on the size of their respective areas:
        The area of a Square is the square of its side
        The area of a Rectangle is width multiplied by height
        The area of a Triangle is base multiplied by height divided by 2
        The area of a Circle is the square of its radius multiplied by π
        The area of a CustomShape is given

        The default sort order of a list of shapes is ascending on area size:
        double side = 1.1234;
        double radius = 1.1234;
        double base = 5;
        double height = 2;

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Square(side));
        shapes.add(new Circle(radius));
        shapes.add(new Triangle(base, height));

        Collections.sort(shapes);
        Use the correct π constant for your circle area calculations:
        Math.PI*/

