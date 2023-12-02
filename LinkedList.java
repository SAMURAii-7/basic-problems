public class LinkedList {
    Node head, tail;
    int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 1;
    }

    public int getLength() {
        // Node curr = head;
        // int count = 0;

        // while (curr != null) {
        // curr = curr.next;
        // count++;
        // }

        // return count;

        return length;
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insert(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        if (pos < 0 || pos > getLength()) {
            System.out.println("Can't Insert " + data + ", Position out of Bounds!");
            return;
        }

        if (pos == 0) {
            insertAtStart(data);
            return;
        }

        if (pos == getLength() - 1) {
            tail.next = newNode;
            tail = newNode;
            return;
        }

        // 1 --> 2 --> 3
        // 0 1 2
        // 1 --> 4 --> 2 --> 3
        // 0 1 2 3

        Node curr = head;
        int currPos = 0;

        while (curr != null) {
            if (currPos == pos - 1) {
                newNode.next = curr.next;
                curr.next = newNode;
                break;
            }
            currPos++;
            curr = curr.next;
        }
        length++;
    }

    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            length++;
            return;
        }

        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            length--;
        }
    }

    public void deleteLast() {
        if (head != null) {
            Node curr = head;
            while (curr != null) {
                if (curr.next == tail) {
                    curr.next = null;
                    tail = curr;
                }
                curr = curr.next;
            }
            length--;
        }
    }

    public void reverseList() {
        // 1-->2-->3
        // 3-->2-->1
        Node prev = head;
        Node curr = head.next;
        tail = head;

        head.next = null;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        head = prev;
    }

    public boolean isCyclic() {
        // using fast pointer to check for cycle
        // the concept is that while both fast and slow pointer traverse the list
        // the fast pointer will eventually lap the slow pointer and meet it if there is
        // a cycle

        Node fastPtr = head;
        Node slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr)
                return true;
        }

        return false;
    }

    public void getMid() {
        int len = getLength();
        int mid;
        if (len % 2 == 0)
            mid = len / 2;
        else
            mid = (len + 1) / 2;

        Node curr = head;
        int pos = 0;

        while (curr != null) {
            if (pos == mid - 1) {
                System.out.print("\nNode " + (pos + 1) + " is the mid point with the value " + curr.val);
                return;
            }
            curr = curr.next;
            pos++;
        }
    }

    public void nthNodeFromEnd(int pos) {
        // if (pos == 1) {
        // System.out.print("\nValue: " + tail.val);
        // return;
        // }
        // int listLen = getLength();
        // if (pos == listLen) {
        // System.out.print("\nValue: " + head.val);
        // return;
        // }

        // Node curr = head;
        // int currPos = 0;
        // while (curr != null) {
        // if (currPos == listLen - pos) {
        // System.out.print("\nValue: " + curr.val);
        // return;
        // }
        // curr = curr.next;
        // currPos++;
        // }

        Node dummy = new Node(0);
        dummy.next = head;
        Node first = dummy;
        Node second = dummy;

        // create a gap of pos number of nodes between the pointers
        for (int i = 0; i <= pos; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }

        System.out.print("\nValue: " + second.next.val);

        dummy.next = null;
    }

    public void printList() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.val);
            curr = curr.next;
            if (curr != null)
                System.out.print(" --> ");
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);
        linkedList.append(6);

        linkedList.insertAtStart(7);
        linkedList.insertAtStart(18);

        // 0 index based insertion
        linkedList.insert(21, 45);
        linkedList.insert(12, 3);
        linkedList.insert(15, 0);

        System.out.println("Linked List:");
        linkedList.printList();

        linkedList.deleteFirst();
        linkedList.deleteLast();

        System.out.println("\nLinked List:");
        linkedList.printList();

        if (linkedList.isCyclic())
            System.out.print("\nList has a cycle");
        else
            System.out.print("\nList does not have a cycle");

        linkedList.nthNodeFromEnd(3);

        linkedList.getMid();

        linkedList.reverseList();

        System.out.println("\nReversed List:");
        linkedList.printList();
    }
}

class Node {
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
        this.next = null;
    }
}