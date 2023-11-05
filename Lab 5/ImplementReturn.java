// Question 5
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

public class ImplementReturn {
  public static Person createPerson(String name, int age) {
    Person person = new Person(name, age);
    return person;
  }

  public static void main(String[] args) {
    Person person1 = createPerson("Kush", 19);
    Person person2 = createPerson("Not Kush", 25);

    System.out.println("Details of person1:");
    person1.printDetails();

    System.out.println("Details of person2:");
    person2.printDetails();
  }
}
