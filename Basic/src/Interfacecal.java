// Define interfaces
interface Add {
    void add();
}

interface Sub {
    void sub();
}

interface Mul {
    void mul();
}

interface Div {
    void div();
}


class Cal implements Add, Sub, Mul, Div {
    int a = 5;
    int b = 5;

    public void add() {
        int result = a + b;
        System.out.println("Addition: " + result);
    }

    public void sub() {
        int result = a - b;
        System.out.println("Subtraction: " + result);
    }

    public void mul() {
        int result = a * b;
        System.out.println("Multiplication: " + result);
    }

    public void div() {
        if (b != 0) {
            int result = a / b;
            System.out.println("Division: " + result);
        } else {
            System.out.println("Division by zero is not allowed.");
        }
    }
}


 class InterfaceCal {
    public static void main(String[] args) {
        Cal obj = new Cal();
        obj.add();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
