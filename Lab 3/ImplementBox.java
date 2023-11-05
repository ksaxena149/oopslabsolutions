import java.util.Scanner;

class Box {
  int length=0;
  int breadth=0;
  int height=0;
  int ar;
  int vol;
  Box(){
    length = 0;
    breadth = 0;
    height = 0;
  }
  Box(int num){
    length=num;
    breadth=num;
    height=num;
  }
  Box(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
    height = 1;
  }
  Box(int length, int breadth, int height){
    this.length = length;
    this.breadth = breadth;
    this.height = height;
  }
  public void area(){
    ar = 2*(length*breadth+breadth*height+length*height);
    vol = length*breadth*height;
  }
  public void display(){
    System.out.println("The Volume is "+vol+" and the surface area is "+ar);
  }
}

public class ImplementBox {
  public static void main(String[] args){
    int l,b,h;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of values(0, 1, 2 or 3): ");
    int a = sc.nextInt();
    switch (a) {
      case 0:
        Box b0 = new Box();
        b0.area();
        b0.display();
        break;
      case 1:
        System.out.println("Enter the value: ");
        l = sc.nextInt();
        Box b1 = new Box(l);
        b1.area();
        b1.display();
        break;
      
      case 2:
        System.out.println("Enter the length: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        b = sc.nextInt();
        Box b2 = new Box(l, b);
        b2.area();
        b2.display();
        break;
      case 3:
        System.out.println("Enter the length: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        b = sc.nextInt();
        System.out.println("Enter the height: ");
        h = sc.nextInt();
        Box b3 = new Box(l,b,h);
        b3.area();
        b3.display();
        break;
      default:
        break;
    }
    sc.close();
  }
}