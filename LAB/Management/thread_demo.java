package Management;


public class thread_demo implements Runnable{

    thread_demo (){}
    public void run(){
          try{
              System.out.println(""+Thread.currentThread().getName());
             Thread. sleep(5000);
              System.out.println(""+Thread.currentThread().getState());

          }
          catch (InterruptedException e){
              e.printStackTrace();
          }
        System.out.println("I run method ; thread name is "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        thread_demo d=new thread_demo();
        System.out.println(d);
        Thread t1=new Thread(d);
        t1.setName("Krish");
        t1.start();
        System.out.println(Thread.currentThread().getName()+"Currentlu in "+d.getState());
    }
}//create array 10 element ,sleep time-> random use random function 
