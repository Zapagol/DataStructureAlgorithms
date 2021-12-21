package com.zap.ds.hashTable;

public class DoublyHashingHashTable {

    private KeyValueBean[] hashTableContainer;
    private int arraySize;
    private int length;

    public DoublyHashingHashTable(int capacity){
        if(isPrime(capacity)){
            this.arraySize = capacity;
            this.length = 0;
            this.hashTableContainer = new KeyValueBean[capacity];
        }else{
            int nextPrime = findNextProme(capacity);
            this.arraySize = nextPrime;
            this.length = 0;
            this.hashTableContainer = new KeyValueBean[nextPrime];
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public int size(){
        return length;
    }
    public void put(String key, String value){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashTableContainer[hashVal] != null){
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        hashTableContainer[hashVal] = new KeyValueBean(key, value);
        length++;
    }
    public String get(String key){
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
    public boolean containsValue(String value){
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
    public boolean containsKey(String key){
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
    public String remove(String key){
        int hashVal = hashFunction1(key);
        int stepSize = hashFunction2(key);
        while (hashTableContainer[hashVal] != null){
            if(hashTableContainer[hashVal].key.equals(key)){
                String value = hashTableContainer[hashVal].value;
                hashTableContainer[hashVal] = null;
                length--;
                return value;
            }
            hashVal = hashVal + stepSize;
            hashVal = hashVal % arraySize;
        }
        return hashTableContainer[hashVal].value;
    }

    private boolean isPrime(int capacity) {
        for (int i = 2; i < capacity / 2; i++) {
            if (capacity % i == 0) {
                return false;
            }
        }
        return true;
    }
    private int findNextProme(int number){
        for(int i = number; true; i++){
            if(isPrime(number)){
                return number;
            }
        }
    }

    /**
     * Ideal index position to insert/search.
     *
     * @param value
     * @return
     */
    private int hashFunction1(String value){
        return findHashCode(value);
    }

    /**
     *
     * @param value
     * @return
     */
    private int hashFunction2(String value){
        int hashCode = findHashCode(value);
        return 3 - hashCode % 3;
    }
    private int findHashCode(String value){
        int hashCode = value.hashCode();
        hashCode = hashCode % arraySize;
        if(hashCode < 0){
            hashCode += arraySize;
        }
        return hashCode;
    }
    public void display(){
        for (int i=0; i<arraySize; i++){
            if(hashTableContainer[i] != null){
                System.out.println("Index position = " + i + ", Key = " + hashTableContainer[i].key
                        + ", Value = " + hashTableContainer[i].value);
            }
        }
    }
}
