package Thread;
class odd extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i+=2)
        {
            System.out.println("The Odd Number is :"+i);
        }
    }
}

class even extends Thread{
        public void run()
    {
        for(int i=2;i<=10;i+=2)
        {
            System.out.println("The Even  Number is :"+i);
        }
    }
}

public class Basic {
    public static void main(String[] args) {
        odd o = new odd();
        even e = new even();
        o.start();
        e.start();
    }

    
}
