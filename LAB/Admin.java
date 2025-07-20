import java.util.Scanner;

public class Admin {


    public static void main(String[] arg) {
        System.out.println("Hi");
        student s=new student();

        Scanner scanf=new Scanner(System.in);
        System.out.print("Enter the value :");
        int id= scanf.nextInt();
        System.out.print("Enter the Name :");
        String name= scanf.next();
       

        
       
        s.getvalue(id,name);
       
    }
}

