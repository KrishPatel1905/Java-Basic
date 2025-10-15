class Parent {
    final void greet() {
        System.out.println("Parent greet");
    }
    void demo(){
        System.out.println("I am Void Method");
    }
}

class Child extends Parent {
    // void greet() { } // ERROR: cannot override final method greet()
      void demo() {
        System.out.println("i am child class method ");
      };

}

public class FinalMethodExample {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet(); // prints: Parent greet
        Parent p1 = new Child();
        p1.demo();
    }
}
