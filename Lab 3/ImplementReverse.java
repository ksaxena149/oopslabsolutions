import java.util.Scanner;
class Reverse {
  int num;
  int rev;
  Reverse(int num){
    this.num = num;
  }
  public void reverseValue(){
    int n=num;
    int remainder;
    while(n != 0){
      remainder = n % 10;
      rev = rev * 10 + remainder;
      n /= 10;
    }
  }
  public void display(){
    System.out.println("The number is: "+num);
    System.out.println("It's Reverse is: "+rev);
  }
}

public class ImplementReverse {
  public static void main(String[] args){
    System.out.println("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    Reverse n1 = new Reverse(number);
    n1.reverseValue();
    n1.display();
    sc.close();
  }
}