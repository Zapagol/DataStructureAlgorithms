package com.zap.ds.linkedlist;

public class GenericSinglyLinkedList<E> {

        public GenericNode first;

        public boolean isEmpty(){
            if(first == null){
                return true;
            }else {
                if (first.next == null) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        public int linkedListLength(GenericNode node){
            int length = 0;
            while (node != null){
                length++;
                node = node.next;
            }
            return length;
        }

        public void insertFirst(E data){
            GenericNode newNode = new GenericNode();
            newNode.data = data;
            newNode.next = first;
            first = newNode;
        }

        public void insertLast(E data){
            GenericNode current = first;
            while (current.next != null){
                current = current.next;
            }
            GenericNode newNode = new GenericNode();
            newNode.data = data;
            current.next = newNode;
        }

        public void insertMiddle(int position, E data){

            if(position == 0){
                insertFirst(data);
            }
            GenericNode current1 = first;
            for(int i = 1; i< position; i++){
                current1 = current1.next;
            }
            GenericNode newNode = new GenericNode();
            newNode.data = data;
            newNode.next = current1.next;
            current1.next = newNode;
        }

        public Object removeFromBegin(){
            GenericNode node = first;
            if(node != null){
                first = node.next;
                node.next = null;
            }
            return node.data;
        }

        public GenericNode removeFromLast(){
            GenericNode current = first, q = null;
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
            return current;
         }

        public void removeIntermediate(int position){
            if(first == null){
                return;
            }
            if(position == 0){
                first = null;
            }else {
                GenericNode temp = first;
                for (int i = 1; i < position; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        public void display(){
            System.out.println("Content in GenericLinkedList --->");
            GenericNode current = first;
            while(current != null){
                current.displayNode();
                current = current.next;
            }
            System.out.println();
        }
}


