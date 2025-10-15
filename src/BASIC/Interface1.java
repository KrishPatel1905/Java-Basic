package BASIC;
 interface Demo {
    default void display()
    {
        System.out.println("Hi My name is demo");
    }

    
}

public class Interface1 {

    public static void main(String[] args) {
            Demo d = new Demo(){};//anonumus class  
            d.display();
        }
    }