package EventManagement;
import java.util.Scanner;


class Robotics extends Event implements Register {
     int count =5;
    String [] arr= new  String[count];
      Scanner sc = new Scanner(System.in);
    Robotics(int id, String ename, String date, String venue) {
        super(id, ename, date, venue);
    }

    @Override
    void displayEventDetails() {
        System.out.println("Robotics Event ............");
        System.out.println("Date: " + date);
        System.out.println("Prize Money: 20000");
    }

    public void registerParticipant() {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter participant name for Robotics: ");
        // String name = sc.nextLine();
        // System.out.println(name + " registered for Robotics!");
           for(int i=0;i<count;i++)
        {
              System.out.print("Enter participant name for Coding: ");
        String namee = sc.nextLine();
            arr[i]=  namee;
              System.out.println(namee + " registered for Robotics!");
        }
    }
       public void show()
    {
        for(int i=0;i<count;i++)
        {
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}
