package Thread;
class Bank{
    private int balance = 1000;
    public void deposite(int amount )
    {
      balance+=amount;
      System.out.println("Deposite Amount : "+amount + "  Total Balance is :"+balance);
    }
    public void withdraw(int amount )
    {
        if(balance>=amount)
        {balance-=amount;
              System.out.println("Withdraw Amount : "+amount + "  Total Balance is :"+balance);

        }
        else{System.out.println("Insufficient balance for withdrawal of " + amount);
}
        
    }
}
class Deposite extends Thread{
    Bank account;

    public void run()
    {
        account.deposite(500);
    }
        Deposite(Bank account)
        {
            this.account=account;
        }
    

    
}
class Withdraw extends Thread{
    Bank account;

    public void run()
    {
        account.withdraw(100);
    }
        Withdraw(Bank account)
        {
            this.account=account;
        }
    

    
}
public class BankThread {
    public static void main(String[] args) {
        Bank account = new Bank();

        Deposite d =new Deposite(account);
        Withdraw w  =new Withdraw(account);

        d.start();
        w.start();
    }
    
}
