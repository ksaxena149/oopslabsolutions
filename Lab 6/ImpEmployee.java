class Employee {
  private int id;
  private String name;
  private int type;//1 = employee, 2 = manager 
  private double baseSalary;//Base salary
  public Employee(int _id, String _name){
    this.id = _id;
    this.name = _name;
  }
  public void setID(int x){
    this.id = x;
  };//id mutator
  public void setName(String x){
    this.name = x;
  };//name mutator
  public int getID(){
    return id;
  };//id accessor
  public String getName(){
    return name;
  };//name accessor • 
  public double getSalary(){
      double salary;
      if(type==2){
          salary = baseSalary+(baseSalary*0.1);
      } else {
          salary = baseSalary;
      }
      return salary;
  }; //if manager, add 10% to base salary
  public void setBaseSalary(double bs){
    this.baseSalary = bs;
  }//sets base salary.
}

public class ImpEmployee {
  public static void main(String args[]){
    
  }
}
