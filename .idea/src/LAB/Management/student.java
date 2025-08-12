package LAB.Management;

public class student extends person{
    protected int sem;

    public student(String n,int a,int s )
    {
        super(n,a);


        sem =s;
       
    }
     public void get()
    {
        System.out.println("Student");
        System.out.println("Name :"+name);
        System.out.println("age :"+age);
        System.out.println("Sem :"+sem);
    }
    

}
