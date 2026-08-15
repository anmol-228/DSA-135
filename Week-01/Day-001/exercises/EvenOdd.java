import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        // Write your solution.
        // Read an integer and print whether it is Even or Odd.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
