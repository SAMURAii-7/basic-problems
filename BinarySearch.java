import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be searched: ");
        int key = sc.nextInt();

        int index = search(arr, key);

        if (index != -1)
            System.out.print("Element found at index " + (index + 1));
        else
            System.out.print("Element not found");
    }

    static int search(int[] arr, int key) {
        int low = 0;
        int high = arr.length;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int val = arr[mid];

            if (val == key)
                return mid;

            else if (val < key)
                low = mid + 1;
            else
                high = mid;
        }
        return -1;
    }
}
