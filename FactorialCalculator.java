import java.util.Scanner;
public class FactorialCalculator {

    public static void main(String[] args) {
        // The number we want to calculate the factorial for
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = scanner.nextInt(); 
        long factorialResult = 1; // Use 'long' for larger results

        // Check for a non-negative number
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Loop from 1 up to the number
            for (int i = 1; i <= number; i++) {
                factorialResult = factorialResult * i;
            }
            // Print the final result
            System.out.println("The factorial of " + number + " is: " + factorialResult);
        }
    }
}