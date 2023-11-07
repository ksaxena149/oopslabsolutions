interface Person {
    String getName();
    void setName(String name);
}

class Student implements Person {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

class Employee implements Person {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

public class ImpPerson {
    public static void main(String[] args) {
        Person student = new Student();
        student.setName("John Doe");
        System.out.println("Student's name: " + student.getName());

        Person employee = new Employee();
        employee.setName("Jane Doe");
        System.out.println("Employee's name: " + employee.getName());
    }
}
