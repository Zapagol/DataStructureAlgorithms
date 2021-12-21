package com.zap.ds.hashTable;


/**
 * It doesn't handle collision.
 * LoadFactor = Total number of item stored / Size of the array
 *
 * Collision Resolutions
 *  1. Open addressing
 *      a. Linear Probing
 *      b. Plus 3 rehash
 *      c. Quadratic Probing
 *      d. Double hashing
 *  2. Closed addressing(Chaining)
 *
 * @param <V>
 */
public class LinearProbingArrayHashTable<V> {

    private int size;
    private V[] hashTableContainer;

    private static final int defaultCapacity = 5;

    public LinearProbingArrayHashTable(){
        this.size = 0;
        hashTableContainer = (V[])new Object[defaultCapacity];
    }
    public LinearProbingArrayHashTable(int initialCapacity){
        this.size = 0;
        hashTableContainer = (V[])new Object[initialCapacity];
    }

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public void put(String key, V value){
        int hashKey = hashKey(key);
        if(hashTableContainer[hashKey] != null){
            System.out.println("Sorry, there is already value for the key in hash table. Key = " + key
                    + " hashKey = " + hashKey);
        }else {
            hashTableContainer[hashKey] = value;
            size++;
        }
    }
    public Object get(String key){
        int hashKey = hashKey(key);
        return hashTableContainer[hashKey];
    }
    public boolean containsValue(Object value){
        if(value == null){
            throw new NullPointerException();
        }
        for(int i=0; i<defaultCapacity; i++){
            if (hashTableContainer[i] != null && hashTableContainer[i].equals(value) ){
                return true;
            }
        }
        return false;
    }
    public Object remove(String key){
        int hashKey = hashKey(key);
        Object value = hashTableContainer[hashKey];
        hashTableContainer[hashKey] = null;
        size--;
        return value;
    }

    private int hashKey(String key){
        if(key == null){
            throw new NullPointerException();
        }
        int hashCode = Math.abs(key.hashCode());
        return hashCode % defaultCapacity;
    }

    public String toString(){
        String result = "Elements : ";
        for(int i = 0; i<defaultCapacity; i++ ){
            if(hashTableContainer[i] != null) {
                result += hashTableContainer[i] + " ";
            }
        }
        return result;
    }

}
