package CALCULATOR;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
       
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value :");
String op= sc.next();
System.out.println("Enter the value of a :");
int a = sc.nextInt();
System.out.println("Enter the value of b :");
int c= sc.nextInt();
while (op!="1") {
    

switch (op) {
    case "+":
        int c= a + b;
        System.out.println("The Value Of :"+c);
        break;
        case "-":
           int c= a - b;
        System.out.println("The Value Of :"+c);
        break;
        case "*":
           int c= a * b;
        System.out.println("The Value Of :"+c);
        break;
        case "d":
        try{
         int c= a / b;
        System.out.println("The Value Of :"+c);
        }catch(ArithmeticException e){
            System.out.println("The Error :"e.getMessage());
            
        }
        finally{
            System.out.println("Done");
        }
          
        break;
        case "1":
           break;
        

    default:
        break;
}
    }
}

}
