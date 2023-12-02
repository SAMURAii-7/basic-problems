import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Enter number of digits required
        // 3
        // 0 1 1
        // print 1 i.e. the 3rd number

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of the Fibonacci number to be printed: ");
        int n = sc.nextInt();
        int res = generateFibonacci(n);
        System.out.println(res);
    }

    public static int generateFibonacci(int num) {
        if (num == 1) {
            return 0;
        } else if (num == 2 || num == 3) {
            return 1;
        } else {
            return generateFibonacci(num - 1) + generateFibonacci(num - 2);
        }
    }
}
