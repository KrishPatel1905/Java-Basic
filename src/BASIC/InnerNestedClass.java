package BASIC;

class Demo {
    static class idemo {
    void show()
    {
        System.out.println("Hi my name is InnerClass....");
    }
        
    }

    
}
public class InnerNestedClass {
              
    public static void main(String[] args) {
        // Demo d= new Demo();
        Demo.idemo i = new Demo.idemo();
        i.show();
    }
}
