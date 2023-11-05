// Question 4
class Person {
  String name;
  int age;

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void printDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }
}

public class ImplementReference {
  public static void main(String[] args) {
    Person person1 = new Person("Kush", 19);
    Person person2 = person1;

    System.out.println("Details of person1:");
    person1.printDetails();

    System.out.println("Details of person2:");
    person2.printDetails();

    person2.name = "Not Kush";
    person2.age = 25;

    System.out.println("Details of person1 after modifying person2:");
    person1.printDetails();

    System.out.println("Details of person2 after modifying person2:");
    person2.printDetails();
  }
}
