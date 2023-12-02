import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        if (checkPalindrome(s))
            System.out.println(s + " is a Palindrome");
        else
            System.out.println(s + " is not a Palindrome");
    }

    public static boolean checkPalindrome(String str) {
        // racecar
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }
}
