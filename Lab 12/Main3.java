class BankAccount {
    private int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ", Balance: " + balance);
        } else {
            System.out.println("Insufficient balance to withdraw " + amount);
        }
    }
}

class Depositor implements Runnable {
    private BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.deposit(100);
        }
    }
}

class Withdrawer implements Runnable {
    private BankAccount account;

    public Withdrawer(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.withdraw(50);
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        new Thread(new Depositor(account)).start();
        new Thread(new Withdrawer(account)).start();
    }
}