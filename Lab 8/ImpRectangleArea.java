import java.util.Scanner;

class Shape {
  int area;
  int getArea() {
    return 0;
  }
}

class Rectangle extends Shape {
  int length;
  int breadth;

  Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

  @Override
  int getArea() {
    return length * breadth;
  }
}

public class ImpRectangleArea {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle: ");
    int length = sc.nextInt();
    System.out.println("Enter the breadth of the rectangle: ");
    int breadth = sc.nextInt();
    Rectangle rectangle = new Rectangle(length, breadth);
    System.out.println("Area of the rectangle: " + rectangle.getArea());
    sc.close();
  }
}
