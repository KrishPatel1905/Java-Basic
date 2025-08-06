package Threads;

import org.w3c.dom.ls.LSOutput;

class threadBasic extends Thread {
public void run(){
    try{
        System.out.println("Thread Started :");
        Thread.sleep(1000);
    }
    catch (Exception e){
        System.out.println("Thread was interrupted.");

    }
}
}


public class BasicThreads {
    public static void main(String[] args) {
        threadBasic t1 = new threadBasic();

        System.out.println("Before :"+t1.isAlive());
        t1.start();
        System.out.println("Before :"+t1.isAlive());
        try{
            t1.join();
        }
        catch (InterruptedException e){
        System.out.println("Thread was interrupted.");}
        System.out.println("After :"+t1.isAlive());
        System.out.println("Threads Ended :");
    }


}
