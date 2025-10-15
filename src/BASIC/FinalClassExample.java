// File: FinalClassExample.java
final class A {
    void show() {
        System.out.println("A.show()");
    }
}

// ---- This will cause a compile error ----
// class B extends A { } // ERROR: cannot inherit from final A

public class FinalClassExample {
    public static void main(String[] args) {
        A a = new A();
        a.show(); // prints: A.show()
    }
}
