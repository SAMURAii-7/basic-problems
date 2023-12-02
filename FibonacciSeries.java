import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        List<Integer> res = generateSeries(n);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }

    public static List<Integer> generateSeries(int num) {
        if (num == 0) {
            System.out.println("Enter a number greater than 0");
            System.exit(1);
        }
        List<Integer> output = new ArrayList<>();
        int n1 = 0, n2 = 1;
        output.add(n1);
        if (num == 1) {
            return output;
        }
        output.add(n2);
        if (num == 2) {
            return output;
        }

        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            output.add(n3);
            n1 = n2;
            n2 = n3;
        }
        return output;
    }
}
