import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter two numbers: ");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            lcm(n1, n2);
        }
    }

    static void lcm(int num1, int num2) {
        // LCM(a, b) = (axb) / GCD(a, b)
        System.out.print((num1 / gcd(num1, num2)) * num2);
    }

    static int gcd(int num1, int num2) {
        if (num1 == 0)
            return num2;
        return gcd(num2 % num1, num1);
    }
}
