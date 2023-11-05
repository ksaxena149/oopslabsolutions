import java.util.Scanner;

class Dog {
  String name;
  String breed;
  Dog(String name, String breed){
    this.name = name;
    this.breed = breed;
  }
  public void setData(String name, String breed){
    this.name = name;
    this.breed = breed;
  }
  public void display(){
    System.out.println("The name of dog is: "+ name);
    System.out.println("The breed of dog is: "+breed);
  }
}

public class ImplementDog {
  public static void main(String args[]){
    System.out.println("Enter name of dog: ");
    Scanner sc = new Scanner(System.in);
    String dname = sc.nextLine();
    System.out.println("Enter breed of dog: ");
    String dage = sc.nextLine();
    Dog d1 = new Dog(dname, dage);
    d1.display();
    d1.setData("Max", "Chihuahua");
    d1.display();
    sc.close();
  }

}
