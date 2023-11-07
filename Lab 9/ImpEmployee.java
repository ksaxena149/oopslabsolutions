interface Taxable {
  double calculateTax();
}

abstract class Employee implements Taxable {
  String name;
  double salary;

  Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  abstract void work();
}

class Manager extends Employee {
  Manager(String name, double salary) {
    super(name, salary);
  }

  @Override
  void work() {
    // Implement work behavior for Manager
  }

  @Override
  public double calculateTax() {
    return salary * 0.30; // Assume 30% tax for simplicity
  }
}

class Developer extends Employee {
  Developer(String name, double salary) {
    super(name, salary);
  }

  @Override
  void work() {
    // Implement work behavior for Developer
  }

  @Override
  public double calculateTax() {
    return salary * 0.25; // Assume 25% tax for simplicity
  }
}

public class ImpEmployee {
  public static void main(String[] args) {
    Manager manager = new Manager("Alice", 100000);
    System.out.println("Manager tax: " + manager.calculateTax());

    Developer developer = new Developer("Bob", 80000);
    System.out.println("Developer tax: " + developer.calculateTax());
  }
}
