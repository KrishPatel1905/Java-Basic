package Thread;
class odd extends Thread{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            int Total=2*i;
             System.out.println("Number is :"+Total);
        }
        System.out.println(".........................");
    }
}

class even extends Thread{
        public void run()
    {
        for(int i=1;i<=10;i++)
        {
           int Total = i*3;
            System.out.println("Number is :"+Total);

        }
          System.out.println(".........................");
    }
}
class f extends Thread{

      public void run()
    {
        for(int i=1;i<=10;i++)
        {
           int Total = i*4;
            System.out.println("Number is :"+Total);

        }
          System.out.println(".........................");
    }

}

public class Basic {
    public static void main(String[] args) {
        odd o = new odd();
        even e = new even();
        f a = new f();
         o.start();

                 o.setPriority(Thread.MAX_PRIORITY);  
        e.setPriority(Thread.NORM_PRIORITY); 
        a.setPriority(Thread.MIN_PRIORITY);   
         
         e.start();
         a.start();   
    }

    
}
