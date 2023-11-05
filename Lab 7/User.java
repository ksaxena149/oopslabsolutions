import java.util.Scanner;

public class User {
  int age;
  String name;
  User(String name, int age){
    this.name = name;
    this.age = age;
  }
  public void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the name: ");
    String name = sc.nextLine();
    System.out.println("Enter the age: ");
    int age = sc.nextInt();
    User u = new User(name, age);
    u.display();
    sc.close();
  }
}