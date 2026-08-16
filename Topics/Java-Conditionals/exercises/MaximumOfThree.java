import java.util.Scanner;

public class MaximumOfThree {
    public static void main(String[] args) {
        // Write your solution.
        // Read three integers and print the maximum of the three.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = sc.nextInt();
        System.out.println("Enter the second number: ");
        int y = sc.nextInt();
        System.out.println("Enter the third number: ");
        int z = sc.nextInt();
        if (x >= y && x >= z) {
            System.out.println("Maximum number of the three: "+ x);
        }else if (y >= x && y >= z) {
            System.out.println("Maximum number of the three: "+ y);
        }else{
            System.out.println("Maximum number of the three: "+ z);
        }
    }
}
