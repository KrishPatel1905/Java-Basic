package CALCULATOR;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter operator (+, -, *, /) or 1 to exit:");
            String op = sc.next();

            if (op.equals("1")) {
                break;
            }

            System.out.println("Enter the value of a:");
            int a = sc.nextInt();
            System.out.println("Enter the value of b:");
            int b = sc.nextInt();

            switch (op) {
                case "+":
                    int result1 = a + b;
                    System.out.println("The Value Of : " + result1);
                    break;

                case "-":
                    int result2 = a - b;
                    System.out.println("The Value Of : " + result2);
                    break;

                case "*":
                    int result3 = a * b;
                    System.out.println("The Value Of : " + result3);
                    break;

                case "/":
                    try {
                        int result4 = a / b;
                        System.out.println("The Value Of : " + result4);
                    } catch (ArithmeticException e) {
                        System.out.println("The Error : " + e.getMessage());
                    } finally {
                        System.out.println("Done");
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    System.out.println(" ");
            }
        }
        sc.close();
    }
}
