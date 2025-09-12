package BankManagementSystem;

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount +
                           ", Current Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew " + amount +
                               ", Current Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " tried to withdraw " + amount +
                               " but insufficient balance! Current Balance: " + balance);
        }
    }
}

class BankThread extends Thread {
    BankAccount account;
    double depositAmount;
    double withdrawAmount;

    BankThread(BankAccount account, double depositAmount, double withdrawAmount, String name) {
        super(name);
        this.account = account;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    public void run() {
        account.deposit(depositAmount);
        account.withdraw(withdrawAmount);
    }
}

public class Task1Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        BankThread t1 = new BankThread(account, 100, 150, "User1");
        BankThread t2 = new BankThread(account, 500, 300, "User2");
        BankThread t3 = new BankThread(account, 100, 50, "User3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join ();
            t2.join();
            t3.join();
        } catch (Exception e) {}

           

        System.out.println("Final Balance:: " + account.balance);
    }
}
