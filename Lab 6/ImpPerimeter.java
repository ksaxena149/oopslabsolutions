class Perimeter {
  int length = 12;
  int breadth = 10;
  Perimeter(){
    int perimeter = 2*(length+breadth);
    System.out.println("The perimeter of the rectangle is "+perimeter);
  }
  Perimeter(int length, int breadth){
    this.length = length;
    this.breadth = breadth;
    int perimeter = 2*(length + breadth);
    System.out.println("The perimeter of the rectangle is "+perimeter);
  }
}
public class ImpPerimeter {
  Perimeter p = new Perimeter();
  Perimeter p2 = new Perimeter(12, 24);
}
