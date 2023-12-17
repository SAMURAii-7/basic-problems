import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            System.out.println("GCD: " + gcd(n1, n2));
        }
    }

    static int gcd(int num1, int num2) {

        // need to make function return void for sol 1 and 2

        // solution 1
        // int min, res = 0;
        // if (num1 < num2)
        // min = num1;
        // else
        // min = num2;

        // for (int i = 1; i <= min; i++) {
        // if (num1 % i == 0 && num2 % i == 0)
        // res = i;
        // }
        // System.out.println("GCD: " + res);

        // Solution 2
        // int res = Math.min(num1, num2);

        // while (res > 0) {
        // if (num1 % res == 0 && num2 % res == 0)
        // break;
        // res--;
        // }
        // System.out.println("GCD: " + res);

        // Solution 3

        // example: gcd of 12 & 18:
        // The function proceeds as follows:

        // Initial call: gcd(12, 18)
        // Recursive call: gcd(18, 12 % 18) → gcd(18, 12)
        // Recursive call: gcd(12, 18 % 12) → gcd(12, 6)
        // Recursive call: gcd(6, 12 % 6) → gcd(6, 0)

        // Since the second argument becomes 0, the function returns the first argument,
        // which is 6. Therefore, result will be 6, as the GCD of 12 and 18 is 6.
        return num2 == 0 ? num1 : gcd(num2, num1 % num2);
    }
}