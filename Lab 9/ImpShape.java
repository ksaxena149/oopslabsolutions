abstract class Shape {
  abstract double getPerimeter();
  abstract double getArea();
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  double getArea() {
    return Math.PI * Math.pow(radius, 2);
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
  double getPerimeter() {
    return 2 * (length + width);
  }

  @Override
  double getArea() {
    return length * width;
  }
}

public class ImpShape {
  public static void main(String[] args) {
    Circle circle = new Circle(5);
    System.out.println("Circle perimeter: " + circle.getPerimeter());
    System.out.println("Circle area: " + circle.getArea());

    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    System.out.println("Rectangle area: " + rectangle.getArea());
  }
}
