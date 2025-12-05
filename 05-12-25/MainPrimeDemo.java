import java.util.Scanner;

public class MainPrimeDemo {

    // Prints all factors of n
    public static void printFactors(int n) {
        System.out.print("Factors of " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Returns the number of factors of n
    public static int countFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }

    // Optimized prime check: returns "Prime" or "Not Prime"
    public static String checkPrime(int n) {
        if (n <= 1) {
            return "Not Prime";
        }

        // Check divisibility from 2 to n / 2
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                // As soon as a divisor is found, it's not prime
                return "Not Prime";
            }
        }

        // If no divisor found, it's prime
        return "Prime";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scan.nextInt();

        // Print all factors
        printFactors(n);

        // Print number of factors
        int factorCount = countFactors(n);
        System.out.println("Number of factors: " + factorCount);

        // Print prime check result
        String result = checkPrime(n);
        System.out.println("Prime check: " + result);

        scan.close();
    }
}
