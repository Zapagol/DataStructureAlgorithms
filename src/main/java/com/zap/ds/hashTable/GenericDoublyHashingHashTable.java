package com.zap.ds.hashTable;

public class GenericDoublyHashingHashTable<K, V> {

    private Entry[] hashTableContainer;
    private int arraySize;
    private int length;

    public GenericDoublyHashingHashTable(int capacity){
        if(isPrime(capacity)){
            this.arraySize = capacity;
            this.length = 0;
            this.hashTableContainer = new Entry[capacity];
        }else{
            int nextPrime = findNextPrime(capacity);
            this.arraySize = nextPrime;
            this.length = 0;
            this.hashTableContainer = new Entry[nextPrime];
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public int size(){
        return length;
    }
    public void put(K key, V value){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashTableContainer[hashVal] != null){
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        hashTableContainer[hashVal] = new Entry(key, value);
        length++;
    }
    public Object get(K key){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashTableContainer[hashVal] != null){
            if(hashTableContainer[hashVal].key.equals(key)){
                return hashTableContainer[hashVal].value;
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashTableContainer[hashVal].value;
    }
    public boolean containsValue(V value){
        if(value == null){
            throw new NullPointerException();
        }
        for(int i=0; i<arraySize; i++){
            if (hashTableContainer[i] != null && hashTableContainer[i].value.equals(value) ){
                return true;
            }
        }
        return false;
    }
    public boolean containsKey(K key){
        if(key == null){
            throw new NullPointerException();
        }
        for(int i=0; i<arraySize; i++){
            if (hashTableContainer[i] != null && hashTableContainer[i].key.equals(key) ){
                return true;
            }
        }
        return false;
    }
    public Entry<?,?> remove(K key){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashTableContainer[hashVal] != null){
            if(hashTableContainer[hashVal].key.equals(key)){
                Entry<?, ?> entry = hashTableContainer[hashVal];
                hashTableContainer[hashVal] = null;
                length--;
                return entry;
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashTableContainer[hashVal];
    }

    private boolean isPrime(int capacity) {
        for (int i = 2; i < capacity / 2; i++) {
            if (capacity % i == 0) {
                return false;
            }
        }
        return true;
    }
    private int findNextPrime(int number){
        for(int i = number; true; i++){
            if(isPrime(number)){
                return number;
            }
        }
    }

    /**
     * Ideal index position to insert/search.
     *
     * @param key
     * @return
     */
    private int hashFunction1(K key){
        return findHashCode(key);
    }

    /**
     *
     * @param key
     * @return
     */
    private int hashFunction2(K key){
        int hashCode = findHashCode(key);
        return 3 - hashCode % 3;
    }
    private int findHashCode(K key){
        int hashCode = key.hashCode();
        hashCode = hashCode % arraySize;
        if(hashCode < 0){
            hashCode += arraySize;
        }
        return hashCode;
    }
    public void display(){
        for (int i=0; i<arraySize; i++){
            //System.out.println(hashTableContainer[i]);
            if(hashTableContainer[i] != null){
                System.out.println("Index position = " + i + ", Key = " + hashTableContainer[i].key
                        + ", Value = " + hashTableContainer[i].value);
            }
        }
    }
}
