package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.Node;

public class CompareLinkedLists {
    public boolean compare2LL(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1.next != null){
            if(temp1.data != temp1.data || temp2.next == null){
                return false;
            }
            temp1.next = temp1;
            temp2.next = temp2;
        }
        return true;
    }
}
