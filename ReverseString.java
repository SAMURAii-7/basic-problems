import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        // hello
        // olleh
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String s = sc.nextLine();
            String res = revString(s);
            System.out.print(res);
        }
    }

    public static String revString(String str) {
        char[] charArray = str.toCharArray();

        int i = 0, j = charArray.length - 1;

        while (i < j) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;

            i++;
            j--;
        }
        return new String(charArray);
    }
}
