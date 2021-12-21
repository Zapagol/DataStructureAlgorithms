package com.zap.ds.linkedlist;

public class CircularLinkedList {
    private Node last;
    int length = 0;

    Node addToEmpty(int data){
        if(last != null)
            return last;
        Node newNode = new Node(data);
        last = newNode;
        newNode.next = last;
        length ++;
        return last;
    }
    Node addFirst(int data){
        if(last == null) return addToEmpty(data);
        Node newNode = new Node(data);
        newNode.next = last.next;
        last.next = newNode;
        return last;
    }
    Node addLast(int data){
        if (last == null) return addToEmpty(data);
        Node temp = new Node(data);
        last.next = temp;
        temp.next = last.next;
        last = temp;
        return last;
    }
     Node addAfter(int data, int item)
    {
        if (last == null)
            return null;

        Node temp, p;
        p = last.next;
        do
        {
            if (p.data == item)
            {
                temp = new Node(data);
                temp.next = p.next;
                p.next = temp;

                if (p == last)
                    last = temp;
                return last;
            }
            p = p.next;
        } while(p != last.next);

        System.out.println(item + " not present in the list.");
        return last;
    }
}
