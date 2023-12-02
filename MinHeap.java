import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    public int length;
    private List<Integer> data;

    public MinHeap() {
        data = new ArrayList<>();
        length = 0;
    }

    public void insert(int value) {
        data.add(length, value);
        heapifyUp(length);
        length++;

    }

    public int delete() {
        if (length == 0) {
            return -1;
        }

        int out = data.get(0);
        length--;

        if (length == 0) {
            data = new ArrayList<>();
            return out;
        }

        data.set(0, data.get(length));
        heapifyDown(0);
        data.remove(length);
        return out;
    }

    public void heapifyUp(int idx) {
        if (idx == 0) {
            return;
        }

        int parentIdx = getParent(idx);
        int parentVal = data.get(parentIdx);
        int val = data.get(idx);

        if (parentVal > val) {
            data.set(idx, parentVal);
            data.set(parentIdx, val);
            heapifyUp(parentIdx);
        }
    }

    public void heapifyDown(int idx) {
        int leftIdx = getLeftChild(idx);
        int rightIdx = getRightChild(idx);

        if (idx >= length || leftIdx >= length) {
            return;
        }

        int leftVal = data.get(leftIdx);
        int rightVal = data.get(rightIdx);
        int val = data.get(idx);

        if (leftVal > rightVal && val > rightVal) {
            data.set(idx, rightVal);
            data.set(rightIdx, val);
            heapifyDown(rightIdx);
        } else if (rightVal > leftVal && val > leftVal) {
            data.set(idx, leftVal);
            data.set(leftIdx, val);
            heapifyDown(leftIdx);
        }
    }

    public int getParent(int idx) {
        return (idx - 1) / 2;
    }

    public int getLeftChild(int idx) {
        return 2 * idx + 1;
    }

    public int getRightChild(int idx) {
        return 2 * idx + 2;
    }

    public void printHeap() {
        for (int i : data) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MinHeap obj = new MinHeap();

        obj.insert(50);
        obj.insert(71);
        obj.insert(21);
        obj.insert(37);
        obj.insert(51);
        obj.insert(19);
        obj.insert(2);
        obj.insert(40);
        obj.insert(100);

        obj.printHeap();

        obj.delete();

        obj.printHeap();
    }
}
