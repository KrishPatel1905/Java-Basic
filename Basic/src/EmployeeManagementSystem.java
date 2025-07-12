import java.util.Scanner;
class Employee
{
    String type;
    int id;
    String name;
    String department;
    int salary;
    static int count=0;
    Employee()
    {
        id = 0;
        name=" ";
        department=" ";
        salary=0;
    }
    Employee(int Id,String Name,String Department,int Salary)
    {
       this.id=Id;
        this.name=Name;
        this.department=Department;
        this.salary=Salary;
        count++;
//        this.type="perment";



    }

//   {
//       System.out.println("Employee Type :");
//  }
    void display()
    {
        System.out.println("Employee ID:"+id);
        System.out.println("Employee :"+name);
        System.out.println("Department :"+department);
        System.out.println("salary :"+salary);
        System.out.println("Number of employee :"+count);
//        System.out.println("Type :"+type);
    }
//   void type()
//   {
//   }
}
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee em=new Employee();
        Employee em1=new Employee(101,"Krish","CE",1000);
        Employee em2=new Employee(101,"Krish","CE",1000);
        em1.display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee type");
        String s=sc.next();
        System.out.println("Enter Employee Type:"+s);


    }
}
