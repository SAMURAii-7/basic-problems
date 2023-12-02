import java.util.Scanner;

public class Factorial {
    // factorial of numbers
    // 5! = 5 x 4 x 3 x 2 x 1 = 120

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int res = calcFactorial(n);
        System.out.println(res);
    }

    public static int calcFactorial(int num) {
        if (num == 0 || num == 1)
            return 1;
        return num * calcFactorial(num - 1);
    }
}
