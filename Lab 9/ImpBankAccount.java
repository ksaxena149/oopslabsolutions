abstract class BankAccount {
  String accountNumber;
  double balance;

  BankAccount(String accountNumber, double balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  abstract void deposit(double amount);
  abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
  SavingsAccount(String accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  void deposit(double amount) {
    balance += amount;
  }

  @Override
  void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }
}

class CheckingAccount extends BankAccount {
  CheckingAccount(String accountNumber, double balance) {
    super(accountNumber, balance);
  }

  @Override
  void deposit(double amount) {
    balance += amount;
  }

  @Override
  void withdraw(double amount) {
    if (balance >= amount) {
      balance -= amount;
    } else {
      System.out.println("Insufficient balance");
    }
  }
}

public class ImpBankAccount {
  public static void main(String[] args) {
    SavingsAccount savingsAccount = new SavingsAccount("123456", 500);
    savingsAccount.deposit(200);
    savingsAccount.withdraw(100);
    System.out.println("Savings Account balance: " + savingsAccount.balance);

    CheckingAccount checkingAccount = new CheckingAccount("654321", 1000);
    checkingAccount.deposit(500);
    checkingAccount.withdraw(200);
    System.out.println("Checking Account balance: " + checkingAccount.balance);
  }
}