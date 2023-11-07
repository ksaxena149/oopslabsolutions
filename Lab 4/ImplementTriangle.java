import java.util.Scanner;

class Triangle {
  int sidea, sideb, sidec;
  float area;
  int perimeter;
  Triangle(){
    sidea = 3;
    sideb = 4;
    sidec = 5;
  }
  Triangle(int sidea, int sideb, int sidec){
    this.sidea = sidea;
    this.sideb = sideb;
    this.sidec = sidec;
  }
  void calc(){
    float s = (sidea+sideb+sidec)/2.0f;
    area = (float)Math.sqrt(s*(s-sidea)*(s-sideb)*(s-sidec));
    perimeter = sidea+sideb+sidec;
  }
  void display(){
    System.out.println("Perimeter: "+perimeter);
    System.out.println("Area: "+area);
  }
}

public class ImplementTriangle {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Triangle t1 = new Triangle();
    t1.calc();
    t1.display();
    System.out.println("Enter Side 1, Side 2, Side 3(Space seperated): ");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    Triangle t2 = new Triangle(a, b, c);
    t2.calc();
    t2.display();
    sc.close();
  }
}
