import java.util.Scanner;

class BankAccount {
  protected double balance;

  void deposit(double amount) {
    balance += amount;
  }

  void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }
}

class SavingsAccount extends BankAccount {
  @Override
  void withdraw(double amount) {
    if (balance - amount < 100) {
      System.out.println("Cannot withdraw as balance would fall below 100");
    } else {
      balance -= amount;
    }
  }
}

public class ImpBank {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    SavingsAccount account = new SavingsAccount();
    System.out.println("Welcome to Bank! What do you want to do?");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    int choice = sc.nextInt();
    switch (choice) {
      case 1:
        System.out.println("Enter the money to be deposited: ");
        int depositMoney = sc.nextInt();
        account.deposit(depositMoney);
        break;
      case 2:
        System.out.println("Enter the money to withdraw: ");
        int withdrawMoney = sc.nextInt();
        account.withdraw(withdrawMoney);
        break;
    
      default:
        break;
    }
    sc.close();
  }
}
