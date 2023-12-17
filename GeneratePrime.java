import java.util.Arrays;
import java.util.Scanner;

public class GeneratePrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of primes: ");
            int n = sc.nextInt();
            generate(n);
        }
    }

    public static void generate(int num) {
        // easy way: create isPrime function and then loop till num and print numbers
        // which are prime
        // efficient way: sieve of eratosthenes
        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= num; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = false;
                }
            }
        }

        for (int i = 2; i <= num; i++) {
            if (prime[i])
                System.out.print(i + " ");
        }
    }
}
