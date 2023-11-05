import java.util.Scanner;

class Fibonacci {
  void fibSeries(int n){
    for(int i = 0; i<=n;i++){
      System.out.print(calcFib(i));
      System.out.print(" ");
    }
  }
  int calcFib(int n){
    if (n==0 || n==1){
      return n;
    }
    return calcFib(n-1)+calcFib(n-2);
  }
}

public class ImplementFibonacci {
  public static void main(String args[]){
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Fibonacci fib = new Fibonacci();
    fib.fibSeries(n);
    sc.close();
  }
}