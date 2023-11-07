import java.util.Scanner;

class Shape {
  double perimeter;
  double area;
  double getPerimeter(){
    return perimeter; // 0
  }
  double getArea(){
    return area; // 0
  }
}

class Circle extends Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double getPerimeter() {
    perimeter = 2 * Math.PI * radius;
    return perimeter;
  }

  @Override
  double getArea() {
    area = Math.PI * Math.pow(radius, 2);
    return area;
  }
}

public class ImpCircle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle: ");
    double radius = sc.nextDouble();
    Circle circle = new Circle(radius);
    System.out.println("Perimeter of the circle: " + circle.getPerimeter());
    System.out.println("Area of the circle: " + circle.getArea());
    sc.close();
  }
}
