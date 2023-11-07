class Employee {
  int sal;
  void work() {
    // Implement work behavior for Employee
  }

  int getSalary() {
    // Implement salary calculation for Employee
    return sal;
  }
}

class HRManager extends Employee {
  @Override
  void work() {
    // Implement work behavior for HRManager
    System.out.println("HR WORKING..."); // putting this for now
  }

  void addEmployee() {
    // Implement addEmployee behavior for HRManager
    System.out.println("ADDED ANOTHER EMPLOYEE"); //putting this for now
  }
}

public class ImpEmployee {
  public static void main(String[] args) {
    HRManager m = new HRManager();
    m.work();
    m.addEmployee();
  }
}
