import java.util.Scanner;
class HCF {
  public static int findHCF(int num1, int num2) {
    if (num2 == 0) {
      return num1;
    } else {
      return findHCF(num2, num1 % num2);
    }
  }
}

public class ImplementHCF{
  public static void main(String[] args) {
    System.out.println("Enter two numbers(Space Seperated): ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int ans = HCF.findHCF(num1, num2);
    System.out.println("HCF of " + num1 + " and " + num2 + " is " + ans);
    sc.close();
  }
}