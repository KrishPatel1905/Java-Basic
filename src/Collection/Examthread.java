class AutoSaveThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) { // simulate 3 autosaves
                System.out.println("Auto-saving answers... (" + i + ")");
                Thread.sleep(2000); // sleep 2 seconds instead of 2 minutes for demo
            }
            System.out.println("Auto-save thread finished.");
        } catch (InterruptedException e) {
            System.out.println("Auto-save interrupted.");
        }
    }
}

class TimerThread extends Thread {
    public void run() {
        try {
            for (int i = 10; i >= 1; i--) {
                System.out.println("Time left: " + i + " seconds");
                Thread.sleep(1000); // sleep 1 second
            }
            System.out.println("Exam time over!");
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted.");
        }
    }
}

public class Examthread {
    public static void main(String[] args) {
        AutoSaveThread autoSave = new AutoSaveThread();  
        TimerThread timer = new TimerThread();           

        autoSave.start();  
        timer.start();    
    }
}
