class Student {
  long rollNo;
  String phoneNo;
  String address;
  Student(long rollNo, String phoneNo, String address){
    this.rollNo = rollNo;
    this.phoneNo = phoneNo;
    this.address = address;
  }
  public void display(){
    System.out.println("rollNo: "+rollNo);
    System.out.println("phoneNo: "+phoneNo);
    System.out.println("Address: "+address);
  }
}

public class ImplementStudent {
  public static void main(String args[]){
    Student Sam = new Student(120930138, "9028301927", "India");
    Student John = new Student(120930137, "9028201927", "Not India");
    Sam.display();
    John.display();
  }
}
