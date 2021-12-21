package com.zap.ds.linkedlist;

public class SinglyLinkedList {
    public Node first;
    public int length;

    public boolean isEmpty(){
        if(first == null){
            return true;
        }else {
            if(first.next == null) {
                return true;
            } else {
                return false;
            }
        }
    }
    public int size(){
        return length;
    }

    public int linkedListLength(Node node){
        int temp = 0;
        while (node != null){
            temp++;
            node = node.next;
        }
        return temp;
    }

    public void insertFirst(int data){
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        length++;
    }

    public void insertLast(int data){
        Node newNode = new Node(data);
        if(first == null){
            first = newNode;
        }else {
            Node current = first;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public void insertMiddle(int position, int data){

        if(position == 0){
            insertFirst(data);
        }else{
            Node current1 = first;
            for(int i = 1; i< position; i++){
                current1 = current1.next;
            }
            Node newNode = new Node(data);
            newNode.next = current1.next;
            current1.next = newNode;
            length++;
        }
    }

    public int removeFromBegin(){
        Node node = first;
        if(node != null){
            first = node.next;
            node.next = null;
        }
        length--;
        return node.data;
    }

    public Node removeFromLast(){
        Node current = first, q = null;
        if(first == null){
            return null;
        }
        if(current.next == null){
            first = null;
            return current;
        }
        while(current.next != null){
            System.out.println("Data = " + current.data);
            q = current;
            current = current.next;
        }
        q.next = null;
        length--;
        return current;
    }

    public void removeIntermediate(int position){
        if(first == null){
            return;
        }
        if(position == 0){
            first = first.next;
        }else {
            Node temp = first;
            for (int i = 1; i < position; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }
    public void removeDuplicate(){
        Node p1 = first;
        if(p1.next == null || p1 == null){
            return;
        }else{
            Node p2 = first.next;
            while (p1 != null || p2 != null){
                if(p1.data == p2.data){
                    p1.next = p2.next;
                }
                //p1 = p1.next;
                p2 = p2.next;
            }
        }

        if(p1.next != null){
            Node p2 = first.next;
            while(p2 != null && p1.next != null){
                if(p1.data == p2.data){
                    p1 = p1.next;
                }
                if(p2.next == null){
                    break;
                }

            }
        }
    }

    public void display(){
        System.out.println("Content in LinkedList --->");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
