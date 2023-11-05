import java.util.Scanner;
class Bill {
  int consumerNo;
  String consumerName;
  int prevMonthReading;
  int currMonthReading;
  boolean isDomestic; // Domestic or Commercial
  Bill(int consumerNo, String consumerName, int prevMonthReading, int currMonthReading, boolean isDomestic){
    this.consumerNo = consumerNo;
    this.consumerName = consumerName;
    this.prevMonthReading = prevMonthReading;
    this.currMonthReading = currMonthReading;
    this.isDomestic = isDomestic;
    
  }
  public void printDetails(){
    System.out.println("Consumer Number: "+consumerNo);
    System.out.println("Consumer Name: "+consumerName);
    System.out.println("Previous Month Reading"+prevMonthReading);
    System.out.println("Current Month Reading"+currMonthReading);
    if(isDomestic){
      System.out.println("This is a Domestic Connection.");
    } else {
      System.out.println("This is a Commercial Connection");
    }
  }
}

public class ImpBill {
  public static void main(String args[]){
    System.out.println("Enter the consumerNo: ");
    Scanner sc = new Scanner(System.in);
    int consumerNo = sc.nextInt();
    System.out.println("Enter the consumerName: ");
    String consumerName = sc.nextLine();
    System.out.println("Enter the Previous Month Reading: ");
    int prevMonthReading = sc.nextInt();
    System.out.println("Enter the Current Month Reading: ");
    int currMonthReading = sc.nextInt();
    System.out.println("Is your Connection Domestic?(true/false): ");
    boolean isDomestic = sc.nextBoolean();
    Bill b = new Bill(consumerNo, consumerName, prevMonthReading, currMonthReading, isDomestic);
    b.printDetails();
    sc.close();
  }
  
}

