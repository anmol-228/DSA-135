import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Write your solution.
        // Read two numbers and an operator (+, -, *, /), print the result.
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String op;
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        System.out.println("Enter the arithematic operation you want to perform: ");
        op = sc.next();
        int result = 0;
        if(op.equals("+")){
            result = num1 + num2;
            System.out.println("Addition performed, Result: "+result);
        }else if(op.equals("-")){
            result = num1 - num2;
            System.out.println("Subtraction performed, Result: "+result);
        }else if(op.equals("*")){
            result = num1 * num2;
            System.out.println("Multiplication performed, Result: "+result);
        }else if(op.equals("/")){
            result = num1 / num2;
            System.out.println("Division performed, Result: "+result);
        }else{
            System.out.println("Invalid operator. Retry!");
        }
    }
}
