import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (checkPalindrome(n))
                System.out.println(n + " is a Palindrome");
            else
                System.out.println(n + " is not a Palindrome");
        }
    }

    public static boolean checkPalindrome(int num) {
        // 1221
        // [1,2,2,1]
        // create reverse
        // compare

        int temp = num;
        int reverseNum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            reverseNum = reverseNum * 10 + digit;
            temp /= 10;
        }

        return num == reverseNum;
    }
}
