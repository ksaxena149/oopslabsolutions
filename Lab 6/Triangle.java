public class Triangle {
  private double height;//Height
  private double base;//Base length
  public Triangle(double h, double b){
    height = h;
    base = b;
  }//Constructor
  public void setHeight(double x){
    height = x;
  }//Sets height
  public double getHeight(){
    return height;
  }//Gets height
  public void setBase(double x){
    base = x;
  }//Sets base length
  public double getBase(){
    return base;
  }//Gets base length
  public double getArea(){
    return height*base/2;
  }//Returns the area of the triangle
  public static void main(String[] args){
    
  }
}
