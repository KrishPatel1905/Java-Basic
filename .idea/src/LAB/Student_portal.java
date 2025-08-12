package LAB;
import java.util.Scanner;

class Student {
    String id, name;

    void insert_data(Scanner scanner) {
        System.out.print("Enter ID: ");
        id = scanner.next();
        System.out.print("Enter Name: ");
        name = scanner.next();
    }
}

class Course extends Student {
    String course, scholarship;

    void insert_data(Scanner scanner) {
        super.insert_data(scanner);
        System.out.print("Enter Course name: ");
        course = scanner.next();
        System.out.print("Scholarship eligibility: ");
        scholarship = scanner.next();
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Scholarship: " + scholarship);
    }
}

public class Student_portal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Course c1 = new Course();
        c1.insert_data(scanner);
        c1.display();
    }
}
