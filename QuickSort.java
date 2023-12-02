public class QuickSort {
    public static void main(String[] args) {
        int[] input = { 8, 7, 1, 2, 21, 3, 4, 30 };
        quickSort(input, 0, (input.length - 1));

        for (int i : input)
            System.out.print(i + " ");
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int pivotIdx = partition(arr, low, high);

        // here both low and high index is included i.e. [low, high]
        // unlike binary search
        // where low was included but high was not included i.e. [low, high)
        quickSort(arr, low, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, high);
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int idx = low - 1;

        for (int i = low; i < high; i++) {
            if (arr[i] <= pivot) {
                idx++;
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        idx++;

        arr[high] = arr[idx];
        arr[idx] = pivot;

        return idx;
    }
}