public class LinkedList {


    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }


    // Given the beginning of a singly linked list head, reverse the list
    // and return the new beginning of the list.

    public ListNode reverseList(ListNode head) {

        // Declare prev to null, this will end up becoming the end of the linkedlist
        ListNode prev = null;

        // This is going to iterate through the list until head becomes null,
        // which is at the end of the list
        while (head != null) {

            // This will repeat the process of bring null in front of prev until
            // it iterates through the whole list
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        // Then return prev
        return prev;
    }

    // You are given the heads of two sorted linked lists list1 and list2.
    // Merge the two lists into one sorted linked list and return the head of the new sorted linked list.
    // The new list should be made up of nodes from list1 and list2.

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        return list1;
    }

    // You are given the head of a singly linked-list.
    //The positions of a linked list of length = 7 for example, can intially be represented as:

    // [0, 1, 2, 3, 4, 5, 6]
    // Reorder the nodes of the linked list to be in the following order:
    // [0, 6, 1, 5, 2, 4, 3]

    // Notice that in the general case for a list of length = n the nodes are reordered to be in the following order:
    // [0, n-1, 1, n-2, 2, n-3, ...]
    // You may not modify the values in the list's nodes, but instead you must reorder the nodes themselves.

    public void reorderList(ListNode head) {

    }

    // You are given the beginning of a linked list head, and an integer n.
    // Remove the nth node from the end of the list and return the beginning of the list.

    public ListNode removeNthFromEnd(ListNode head, int n) {

        return head;
    }

    // Given the beginning of a linked list head, return true if there is a cycle in the linked list.
    // Otherwise, return false.

    // There is a cycle in a linked list if at least one node in the list
    // that can be visited again by following the next pointer.

    // Internally, index determines the index of the beginning of the cycle, if it exists. The tail node of the list will set it's next pointer to the index-th node. If index = -1, then the tail node points to null and no cycle exists.
    // Note: index is not given to you as a parameter.

    public boolean hasCycle(ListNode head) {

        return false;
    }

    // You are given an array of k linked lists [lists], where each list is sorted in ascending order.

    // Return the sorted linked list that is the result of merging all the individual linked lists.

    public ListNode mergeKLists(ListNode[] lists) {

        return null;
    }




}
