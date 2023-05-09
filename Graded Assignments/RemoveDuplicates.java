//Sample input: Linked-List:- 2->5->12->2->3->5->1->2->5->5
package NewLinkedList;

import java.util.*;

public class RemoveDuplicates {
    // Printing the Original Linked List
    public static void printLinkedList(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + "->");
        }
        System.out.println("null");
    }

    // Remove the Duplicate Elemnents from the Linked List
    public static void removeDuplicates(LinkedList<Integer> ll) {
        for (int i = 0; i < ll.size(); i++) {
            int currNode = ll.get(i);
            for (int j = i + 1; j < ll.size(); j++) {
                // int nextNode = ll.get(j);
                if (ll.get(j) == currNode) {
                    ll.remove(j);
                    j--;
                }
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(2);
        ll.add(5);
        ll.add(12);
        ll.add(2);
        ll.add(3);
        ll.add(5);
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(5);

        // Printing the Original Linked List
        System.out.print("Original Linked List: ");
        printLinkedList(ll);

        // Updated Linked List
        removeDuplicates(ll);
        System.out.print("After Removing Duplicate Elements Linked List is: ");
        printLinkedList(ll);
    }
}
