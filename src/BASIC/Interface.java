package BASIC;
class Demo implements Try{
    void show()
    {
     System.out.println("Hello my name is Demo");
    }
}
interface Try {
  default  void display()
    {    System.out.println("Hello My name is Try block");}

}

public class Interface {
    public static void main(String[] args) {
        Demo d = new Demo();
        
        d.display();
        
    }

    
}
