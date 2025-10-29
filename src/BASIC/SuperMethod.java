package BASIC;
class parent {
 void display()
 {
    System.out.println("Hi I am Parent Class ..");
 }
    
}

class Child extends parent {
    void display()
    {
        super.display();
        System.out.println("Hi I am child class ");
    }

    
    
}

public class SuperMethod {
    public static void main(String[] args) {
        Child c = new Child();
          c.display();
    }
    
}
