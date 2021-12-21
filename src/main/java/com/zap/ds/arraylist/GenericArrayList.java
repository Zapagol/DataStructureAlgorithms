package com.zap.ds.arraylist;

import java.util.Arrays;
import java.util.Optional;

public class GenericArrayList<T> {
    private int length;
    private int capacity;
    private Object[] arrayListContainer;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Contrsuctor with default capacity 10.
     */
    public GenericArrayList(){
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.arrayListContainer = new Object[capacity];
    }

    public GenericArrayList(int initialCapacity){
        this.capacity = initialCapacity;
        this.length = 0;
        this.arrayListContainer = new Object[initialCapacity];
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void add(T data){
        if(capacity == length){
            increaseCapacity();
        }
        arrayListContainer[length++] = data;
    }
    public void add(int index, T data){
        if(capacity == length){
            increaseCapacity();
        }
        System.arraycopy(arrayListContainer, index, arrayListContainer, index + 1,
                length - index);
        arrayListContainer[index] = data;
        length++;
    }
    public boolean contains(T data){
        for(int i=0; i<length; i++){
            if(arrayListContainer[i] == data){
                return true;
            }
        }
        return false;
    }
    public int indexOf(T data){
        for(int i=0; i<length; i++){
            if(arrayListContainer[i] == data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for(int i=length - 1; i>=0; i--){
            if(arrayListContainer[i] == data){
                return i;
            }
        }
        return -1;
    }

    /**
     * Remove last element from the array.
     * @return
     */
    public Object remove(){
        Object oldValue = arrayListContainer[length - 1];
        arrayListContainer[--length] = null;
        return oldValue;
    }
    public Object remove(int index){
        if(index >= length || index < 0){
            throw new ArrayIndexOutOfBoundsException("Not valid index number : " + index);
        }
        Object oldValue = arrayListContainer[index];
        arrayListContainer[index] = null;
        length--;
        return oldValue;
    }
    public Object set(int index, T data) {
        if (index >= length || index < 0)
            throw new IndexOutOfBoundsException("Not valid index number : " + index);

        Object oldValue = arrayListContainer[index];
        arrayListContainer[index] = data;
        return oldValue;
    }
    public Object get(int index){
        if (index >= length || index < 0)
            throw new IndexOutOfBoundsException("Not valid index number : " + index);
        return arrayListContainer[index];
    }
    public void removeAll(){
        length = 0;
        arrayListContainer = null;
        arrayListContainer = new String[DEFAULT_CAPACITY];
    }
    public void displayArrayList(){
        String result = "Elements in ArrayList: ";
        for(int i=0; i<length; i++){
            result += arrayListContainer[i] + ", ";
        }
        //Remove last ','
        String finalResult = removeLastCharRegexOptional(result.trim());
        System.out.println(finalResult);

    }
    private static String removeLastCharRegexOptional(String s) {
        return Optional.ofNullable(s)
                .map(str -> str.replaceAll(".$", ""))
                .orElse(s);
    }

    /**
     * Increase the ArrayList capacity by 2.
     */
    private void increaseCapacity(){
        int newCapacity = length + 2;
        Object[] newContainer;
        newContainer = Arrays.copyOf(arrayListContainer, newCapacity);
        arrayListContainer = newContainer;
        this.capacity = newCapacity;
    }
}
