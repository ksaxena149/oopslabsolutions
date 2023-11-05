import java.util.Scanner;

class Person {
  String name;
  int age;
  Person(String name, int age){
    this.name = name;
    this.age = age;
  }
  public void display(){
    System.out.println("The name is: "+name);
    System.out.println("The age is: "+age);
  }
}


public class ImplementPerson {
  public static void main(String args[]){
    Person p1 = new Person("Kush", 19);
    p1.display();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String n = sc.nextLine();
    System.out.println("Enter the age: ");
    int age = sc.nextInt();
    Person p2 = new Person(n, age);
    p2.display();
    sc.close();
  }
}
