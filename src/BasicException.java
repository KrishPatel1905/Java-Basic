class Check extends Exception {
    Check(int a) {
        super("Age must be 18 or above, but found: " + a);
    }
}

public class BasicException {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new Check(age);  
            }
            System.out.println("You are eligible.");
        } catch (Check e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
