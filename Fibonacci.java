import java.util.Scanner;

public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case 1
        } else if (n == 1) {
            return 1; // Base case 2
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive case
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a position to calculate the Fibonacci number: ");
        int position = scanner.nextInt(); // User input

        // Start time measurement
        long startTime = System.nanoTime();

        // Compute Fibonacci
        int result = fibonacci(position);

        // End time measurement
        long endTime = System.nanoTime();
        long runtime = endTime - startTime; // Runtime in nanoseconds

        // Output the result and runtime
        System.out.println("The Fibonacci number at position " + position + " is: " + result);
        System.out.println("Runtime: " + runtime + " nanoseconds");

        scanner.close();
    }
}