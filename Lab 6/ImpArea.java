class Area {
  int length;
  int breadth;
  Area(){
    length = 10;
    breadth = 12;
    int area = length*breadth;
    System.out.println("The area of the rectangle is "+area);
  }
}

public class ImpArea {
  Area a = new Area();

}
