package com.zap.ds.linkedlist.puzzles;

import com.zap.ds.linkedlist.SinglyLinkedList;
import com.zap.ds.linkedlist.Node;

public class FindLnegthOfLoopInLL {

    public int findLengthOfLoop(SinglyLinkedList linkedList){
        Node slowPtr = linkedList.first;
        Node fastPtr = linkedList.first;

        while(fastPtr != null && fastPtr.next != null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if(slowPtr == fastPtr){
                return countNodes(slowPtr);
            }
        }
        return 0;
    }

    int countNodes( Node node)
    {
        int count = 1;
        Node temp = node;
        while (temp.next != node)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
