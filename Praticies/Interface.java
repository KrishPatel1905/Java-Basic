 interface human {
         void display();  
    
}
class krish implements human{
    public void display()
    {
        System.out.println("Hi My Name Is Krish");
    }
}
 class jack implements human{
      public void display()
      {
        System.out.println("Hi My Name is jack");
      }
    
}
 class jhon implements human{
public  void display()
 {
  System.out.println("HI My name is jhon ");
 }
    
}
public class Interface {
    public static void main(String[] args) {
      human h;
      h=new krish();
      h.display();
      h=new jack();
      h.display();
      h=new jhon();
      h.display();
    }
}
