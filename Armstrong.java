import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            if (check(n))
                System.out.print("true");
            else
                System.out.print("false");
        }
    }

    static boolean check(int num) {
        // 153
        // 1^3 + 5^3 + 3^3 = 153
        // sum of digit^num_of_digits = number
        int temp = num;
        int res = 0;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        temp = num;
        while (temp != 0) {
            res += Math.pow(temp % 10, count);
            temp /= 10;
        }
        return res == num;
    }
}
