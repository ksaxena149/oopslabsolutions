import java.util.Scanner;

public class Calculator {
  public static float calculate(int num1, int num2, char operator){
    float ans=0;
    switch (operator) {
      case '+':
        ans = num1+num2;
        break;
    
      case '-':
        ans = num1-num2;
        break;
      case '*':
        ans = num1*num2;
        break;
      case '/':
        ans = num1/num2;
        break;
      default:
        System.out.println("Invalid Operator");
        break;
    }
    return ans;
  }
  public static void main(String args[]){
    System.out.println("Enter the first number: ");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    System.out.println("Enter the second number");
    int num2 = sc.nextInt();
    System.out.println("Enter the operator ('+'/'-'/'/'/'*'): ");
    char operator = sc.next().charAt(0);
    float ans = Calculator.calculate(num1, num2, operator);
    System.out.println("The answer is: "+ans);
    sc.close();
  }
}
