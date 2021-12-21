package com.zap.ds.hashTable;

import java.util.HashMap;

/**
 * We use two data structures to implement an LRU Cache.
 *
 * 1. Queue which is implemented using a doubly linked list. The maximum size of the queue will be equal
 * to the total number of frames available (cache size). The most recently used pages will be near front
 * end and least recently pages will be near the rear end.
 *
 * 2. A Hash with page number as key and address of the corresponding queue node as value.
 *
 * - In practice, LRU cache is a kind of Queue — if an element is reaccessed, it goes to the end of the
 * eviction order
 * - This queue will have a specific capacity as the cache has a limited size. Whenever a new element is
 * brought in, it is added at the head of the queue. When eviction happens, it happens from the tail of
 * the queue.
 * - Hitting data in the cache must be done in constant time, which isn't possible in Queue! But, it is
 * possible with Java's HashMap data structure
 * - Removal of the least recently used element must be done in constant time, which means for the implementation
 * of Queue, we'll use DoublyLinkedList instead of SingleLinkedList or an array
 *
 * <h>So, the LRU cache is nothing but a combination of the DoublyLinkedList and the HashMap as shown below:<h/>
 *
 * <LRU Algorithm/>
 * The LRU algorithm is pretty easy! If the key is present in HashMap, it's a cache hit; else, it's a cache miss.
 *
 * We'll follow two steps after a cache miss occurs:
 *      - Add a new element in front of the list.
 *      - Add a new entry in HashMap and refer to the head of the list.
 * And, we'll do two steps after a cache hit:
 *      - Remove the hit element and add it in front of the list.
 *      - Update HashMap with a new reference to the front of the list.
 *
 */
public class LRUCache {
    class Node {

        int key;
        int val;
        Node pre;
        Node next;

        public Node(int key, int val) {

            this.key = key;
            this.val = val;
        }
    }
    HashMap<Integer,Node> map;
    int capacity;
    Node head;
    Node tail;

    public LRUCache(int capacity) {

        this.capacity = capacity;
        this.map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {

        if(map.containsKey(key)) {

            Node n = map.get(key);
            remove(n);
            add(n);

            return n.val;

        } else {

            return -1;
        }
    }
    public void put(int key, int value) {

        if(map.containsKey(key)) remove(map.get(key));

        if(map.size() == capacity) remove(tail.pre);

        add(new Node(key,value));
    }
    public void remove(Node node) {

        map.remove(node.key);
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void add(Node node) {

        map.put(node.key,node);
        Node temp = head.next;
        node.next = temp;
        temp.pre = node;
        head.next = node;
        node.pre = head;
    }
}
