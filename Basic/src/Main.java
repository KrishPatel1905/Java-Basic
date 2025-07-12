import java.util.Scanner;

class UserInputExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create Scanner object

        // String input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Integer input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Double input
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        // Displaying user input
        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Student: " + isStudent);

        scanner.close(); // Close Scanner
    }
}
