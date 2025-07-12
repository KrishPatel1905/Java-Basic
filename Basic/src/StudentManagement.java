import java.util.Scanner;
class s{
   private String name;
   private String id;
   private String department;
   s(String name,String id,String department)
   {
       name=name;
       id=id;
       department=department;

   }
   void display()
   {
       System.out.println("Name: "+name);
       System.out.println("ID: "+id);
       System.out.println("Department: "+department);
   }
}
public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name:");
        String n=sc.next();
        System.out.println("Enter your ID:");
        String i=sc.next();
        System.out.println("Enter your Department:");
        String d=sc.next();
        s obj1= new s(n,i,d);
        obj1.display();

    }
}
