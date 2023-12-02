import java.util.Scanner;

// ---------------------------------------------------------------
// ----------------------INCOMPLETE-------------------------------
// ---------------------------------------------------------------

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sortedArray = sort(arr, n);

        for (int i : sortedArray)
            System.out.print(i + " ");
    }

    static int[] sort(int[] arr, int n) {
        return arr;
    }
}
