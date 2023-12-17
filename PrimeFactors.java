import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            factors(n);
        }
    }

    static void factors(int num) {
        // 12 = 2 x 2 x 3
        while (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }

        if (num > 2)
            System.out.print(num);
    }
}
