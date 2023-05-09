package NewLinkedList;

// Creating Node Structure
class Node {
    int value;
    Node next;
}

class LList {
    Node head;
    int size;

    public LList() {
        this.size = 0;
        this.head = null;
    }

    // Function to add Node
    public void addNode(int item) {
        Node newNode = new Node();
        newNode.value = item;

        Node currNode = this.head;
        if (this.head == null) {
            this.head = newNode;
            this.head.next = null;
            this.size += 1;
        } else {
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            newNode.next = null;
            this.size += 1;
        }
    }

    // Printing LL1 and LL2 individually
    public void printLinkedList() {
        Node currNode = this.head;
        if (currNode == null) {
            System.out.println("Linked List is empty........");
        } else {
            while (currNode != null) {
                System.out.print(currNode.value + "->");
                currNode = currNode.next;
            }
            System.out.print("null");
        }
    }
}

public class MergeSortLinkedList {
    // Method to merge two linked list
    public static Node mergeSortedList(Node l1, Node l2) {
        Node dummyHead = new Node();
        Node tail = dummyHead;

        while (true) {
            if (l1 == null) {
                tail.next = l2;
                break;
            }

            if (l2 == null) {
                tail.next = l1;
                break;
            }

            if (l1.value <= l2.value) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        return dummyHead.next;
    }

    // Sort the two Linked List
    public static Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node secondHalf = slow.next;
        slow.next = null;

        Node firstHalf = sortList(head);
        secondHalf = sortList(secondHalf);

        return mergeSortedList(firstHalf, secondHalf);
    }

    public static void main(String[] args) {
        // Creating First Linked List
        LList list1 = new LList();
        list1.addNode(25);
        list1.addNode(35);
        list1.addNode(12);
        list1.addNode(4);
        list1.addNode(36);
        list1.addNode(48);

        // Printing the First Linked List
        System.out.print("Linked List 1:");
        list1.printLinkedList();

        // Creating First Linked List
        LList list2 = new LList();
        list2.addNode(8);
        list2.addNode(32);
        list2.addNode(22);
        list2.addNode(45);
        list2.addNode(63);
        list2.addNode(49);

        // For changing line
        System.out.println();

        // Printing the Second Linked List
        System.out.print("Linked List 2:");
        list2.printLinkedList();

        // For changing line
        System.out.println();

        Node mergedList = mergeSortedList(list1.head, list2.head);
        Node sortedList = sortList(mergedList);

        System.out.println("Sorted & Merged Linked List is: ");
        while (sortedList != null) {
            System.out.print(sortedList.value + "->");
            sortedList = sortedList.next;
        }
        System.out.print("null");
    }
}
