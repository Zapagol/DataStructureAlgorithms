package com.zap.ds.queue;

public class PriorityQueueUsingLL {
    public int size;
    public PQNode head;

    public boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    public int size(){
        return size;
    }
    public void insert(int data, int priority){
        PQNode temp = head;
        PQNode newNode = new PQNode(data, priority);

        if(head == null){
            head = newNode;
        }else{
            if(head.priority < priority){
                newNode.next = head;
                head = newNode;
                size++;
            }else {
                if(temp.next != null && temp.next.priority > priority){
                    temp = temp.next;
                }
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
            }
        }



    }
    public int peek(){
        return head.data;
    }
    public void display(){
        System.out.print(head.data + " ");
        while (head.next != null){
            head = head.next;
            System.out.print(head.data + " ");
        }
        System.out.println();
    }

    public static void main(String []args){
        PriorityQueueUsingLL pq = new PriorityQueueUsingLL();
        pq.insert(4, 2);
        pq.display();
        pq.insert(9, 5);
        pq.display();
        pq.insert(3, 9);
        pq.display();


    }
}
