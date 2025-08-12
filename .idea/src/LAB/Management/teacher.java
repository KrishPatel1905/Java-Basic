package LAB.Management;

public class teacher extends person {
  protected String sub;
  public teacher(String n,int a,String sb)
  {
      super(n, a);


    sub=sb;
    
  }
 public void get()
    {
        System.out.println("Teacher");
        System.out.println("Name :"+name);
        System.out.println("age : "+age);
        System.out.println("subject :"+sub);
    }
    
}
