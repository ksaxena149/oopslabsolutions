class Vehicle {
  void drive(){

  }

}

class Car extends Vehicle {
  @Override
  void drive(){
    System.out.println("Repairing a car");
  }
}
public class ImpCar {
  public static void main(String[] args) {
    Car c = new Car();
    c.drive();
  }
}
