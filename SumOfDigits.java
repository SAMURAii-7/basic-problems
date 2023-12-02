import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sum(n);
    }

    static void sum(int num) {
        // 123
        // 6
        int temp = num;
        int res = 0;
        while (temp != 0) {
            res += temp % 10;
            temp /= 10;
        }
        System.out.print(res);
    }
}
