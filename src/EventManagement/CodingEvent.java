package EventManagement;
import java.util.Scanner;

class CodingEvent extends Event implements Register {
        int n=5;
    String [] arr= new  String[n];
    Scanner sc = new Scanner(System.in);
    CodingEvent(int id, String ename, String date, String venue) {
        super(id, ename, date, venue);
    }

    @Override
    void displayEventDetails() {
        System.out.println("Coding Event ............");
        System.out.println("Date: " + date);
        System.out.println("Prize Money: 10000");
    }

    public void registerParticipant() {
        
        // System.out.print("Enter participant name for Coding: ");
        // String name = sc.nextLine();
     
        
        for(int i=0;i<n;i++)
        {
              System.out.print("Enter participant name for Coding: ");
        String namee = sc.nextLine();
            arr[i]=  namee;
               System.out.println(namee + " registered for Coding!");
        }
    }
    public void show()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}