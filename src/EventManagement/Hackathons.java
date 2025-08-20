package EventManagement;
import java.util.Scanner;

class Hackathons extends Event implements Register {
     int count =5;
    String [] arr= new  String[count];
     Scanner sc = new Scanner(System.in);
    Hackathons(int id, String ename, String date, String venue) {
        super(id, ename, date, venue);
    }

    @Override
    void displayEventDetails() {
        System.out.println("Hackathon Event ............");
        System.out.println("Date: " + date);
        System.out.println("Prize Money: 15000");
    }

    public void registerParticipant() {
       
        // System.out.print("Enter participant name for Hackathon: ");
        // String name = sc.nextLine();
        // System.out.println(name + " registered for Hackathon!");
           for(int i=0;i<count;i++)
        {
              System.out.print("Enter participant name for Coding: ");
        String namee = sc.nextLine();
            arr[i]=  namee;
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
