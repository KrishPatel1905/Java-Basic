package Management.java;
import java.util.Scanner;

public class CodingEvent extends Eventt {
    CodingEvent(int id, String ename, String date, String venue)
    {
        super(id,ename,date,venue);
    }
        @Override
   public void displayEventDetails() {
        System.out.println("Coding Event ............");
        System.out.println("Date: " + date);
        System.out.println("Prize Money: 10000");
    }

    public void registerParticipant() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter participant name for Coding: ");
        String name = sc.nextLine();
        System.out.println(name + " registered for Coding!");
    }
    
}
