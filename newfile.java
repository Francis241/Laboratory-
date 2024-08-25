import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        // Prompt the user to enter the number of rows
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        
        System.out.print("*\n");
        
        // Print the ascending half-diamond pattern   
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            } 
        // Print the descending half-diamond pattern
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println("*");
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println("*");
        }
        System.out.print("*");
    }
}    