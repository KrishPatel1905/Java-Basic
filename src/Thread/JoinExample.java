package Thread;


class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println(name + " started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        System.out.println(name + " finished");
    }
}

public class JoinExample {
    
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.start();
        t1.join();   // wait for t1

        t2.start(); 
        t2.join();   // wait for t2

        t3.start();
    }
}
