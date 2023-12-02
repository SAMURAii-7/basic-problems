import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.print("n1 = " + n1);
        System.out.println(" n2 = " + n2);

        // n1 = 2, n2 = 3
        // n1 = 3, n2 = 2

        n1 = n1 * n2; // 6
        n2 = n1 / n2; // 6 / 3 = 2
        n1 = n1 / n2; // 6 / 2 = 3

        System.out.print("n1 = " + n1);
        System.out.println(" n2 = " + n2);
    }
}
