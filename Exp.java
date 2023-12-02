import java.util.Scanner;

public class Exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number and the power: ");
        int n = sc.nextInt();
        int power = sc.nextInt();
        System.out.print(pow(n, power));
    }

    static int pow(int n, int power) {
        // naive solution [O(n)]
        // int res = 1;
        // for (int i = 0; i < power; i++) {
        // res *= n;
        // }
        // System.out.print(res);

        // Divide & Conquer solution [O(n)]
        // if (power == 0) {
        // return 1;
        // }

        // else if (power % 2 == 0) {
        // return pow(n, power / 2) * pow(n, power / 2);
        // } else
        // return n * pow(n, power / 2) * pow(n, power / 2);

        // Optimized Divide & Conquer solution [O(logn)]
        if (power == 0)
            return 1;
        int temp = pow(n, power / 2);
        if (power % 2 == 0)
            return temp * temp;
        else
            return n * temp * temp;
    }
}
