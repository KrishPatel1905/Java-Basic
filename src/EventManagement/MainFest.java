package EventManagement;

import java.util.Scanner;

interface Register {
    void registerParticipant();
    void show();
}
public class MainFest {
    public static void main(String[] args) {
        CodingEvent e1 = new CodingEvent(1, "Code Clash", "25/08/2025", "Hall A");
        Robotics e2 = new Robotics(2, "Robo Fest", "26/08/2025", "Hall B");
        Hackathons e3 = new Hackathons(3, "HackX", "27/08/2025", "Hall C");

        // e1.displayEventDetails();
        // e1.registerParticipant();

        // e2.displayEventDetails();
        // e2.registerParticipant();

        // e3.displayEventDetails();
        // e3.registerParticipant();
        
      
    int ch;
               do {
                  Scanner s = new Scanner(System.in);
      System.out.println("Enter The Choice\n1.Coding Event\n2.Hackathone\n3Robotic\n4.exit ");
         ch= s.nextInt();
                
                       switch (ch) {
            case 1:
            
                 e1.registerParticipant( );
                break;
                case 2:
                 e2.registerParticipant();
                 break;
                 case 3 :
                 e3.registerParticipant();
                 case 4 :
                 e1.show();
                 case 10 :
                 break;

            default:
                break;
        }
               } while (ch!=4);
    
    }
}
