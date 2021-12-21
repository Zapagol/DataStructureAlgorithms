package com.zap.ds.linkedlist.puzzles;

public class PalindromeCheck {
    static Node head;
    static Node slow_ptr, fast_ptr, second_helf;

    static class Node{
        char data;
        Node next;
        public Node(char data){
            this.data = data;
            this.next = null;
        }
    }

    static boolean isPalindrome(Node head){
        slow_ptr = head;
        fast_ptr = head;
        Node prev_slow_ptr = head;
        Node midnode = null;
        boolean res = true;

        if(head != null && head.next != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                prev_slow_ptr = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
        /* fast_ptr would become NULL when there are even elements
               in the list and not NULL for odd elements. We need to skip
               the middle node for odd case and store it somewhere so that
               we can restore the original list */
            if (fast_ptr != null) {
                midnode = slow_ptr;
                slow_ptr = slow_ptr.next;
            }
            // Now reverse the second half and compare it with first half
            second_helf = slow_ptr;
            prev_slow_ptr.next = null; // NULL terminate first half
            reverse(); // Reverse the second half
            res = compareLists(head, second_helf); // compare

            /* Construct the original list back */
            reverse(); // Reverse the second half again

            if (midnode != null) {
                // If there was a mid node (odd size case) which
                // was not part of either first half or second half.
                prev_slow_ptr.next = midnode;
                midnode.next = second_helf;
            }
            else
                prev_slow_ptr.next = second_helf;
        }
        return res;
    }

    static void reverse(){
        Node prev = null;
        Node curr = second_helf;
        Node next;
        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        second_helf = prev;
    }

    /* Function to check if two input lists have same data*/
    static boolean compareLists(Node head1, Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data == temp2.data) {
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            else
                return false;
        }

        /* Both are empty reurn 1*/
        if (temp1 == null && temp2 == null)
            return true;

        /* Will reach here when one is NULL
           and other is not */
        return false;
    }

    public void push(char new_data)
    {
        /* Allocate the Node &
           Put in the data */
        Node new_node = new Node(new_data);

        /* link the old list off the new one */
        new_node.next = head;

        /* Move the head to point to new Node */
        head = new_node;
    }

    // A utility function to print a given linked list
    void printList(Node ptr)
    {
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {

        /* Start with the empty list */
        PalindromeCheck llist = new PalindromeCheck();

        char str[] = { 'a', 'b', 'a', 'c', 'a', 'b', 'a' };
        String string = new String(str);
        for (int i = 0; i < 7; i++) {
            llist.push(str[i]);
            llist.printList(llist.head);
            if (llist.isPalindrome(llist.head) != false) {
                System.out.println("Is Palindrome");
                System.out.println("");
            }
            else {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
        }
    }

}
