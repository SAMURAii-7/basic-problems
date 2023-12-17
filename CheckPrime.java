import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (check(n))
                System.out.print("Prime");
            else
                System.out.print("Not Prime");
        }
    }

    public static boolean check(int num) {

        if (num <= 1)
            return false;

        if (num == 2)
            return true;

        if (num % 2 == 0)
            return false;

        // can also do i*i <= num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
