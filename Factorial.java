import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = scanner.nextInt(); // User input

        // Start time measurement
        long startTime = System.nanoTime();

        // Compute factorial
        int result = factorial(num);

        // End time measurement
        long endTime = System.nanoTime();
        long runtime = endTime - startTime; // Runtime in nanoseconds

        // Output the result and runtime
        System.out.println("The factorial of " + num + " is: " + result);
        System.out.println("Runtime: " + runtime + " nanoseconds");

        scanner.close();
    }
}