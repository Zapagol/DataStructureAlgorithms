package com.zap.ds.arraylist;

import java.util.Arrays;
import java.util.Optional;

public class ArrayList {
    private int length;
    private int capacity;
    private String[] arrayListContainer;

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * Contrsuctor with default capacity 10.
     */
    public ArrayList(){
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.arrayListContainer = new String[capacity];
    }

    public ArrayList(int initialCapacity){
        this.capacity = initialCapacity;
        this.length = 0;
        this.arrayListContainer = new String[initialCapacity];
    }
    public int size(){
        return length;
    }
    public boolean isEmpty(){
        return length == 0;
    }
    public void add(String data){
        if(capacity == length){
            increaseCapacity();
        }
        arrayListContainer[length++] = data;
    }
    public void add(int index, String data){
        if(capacity == length){
            increaseCapacity();
        }
        System.arraycopy(arrayListContainer, index, arrayListContainer, index + 1,
                length - index);
        arrayListContainer[index] = data;
        length++;
    }
    public boolean contains(String data){
        for(int i=0; i<length; i++){
            if(arrayListContainer[i] == data){
                return true;
            }
        }
        return false;
    }
    public int indexOf(String data){
        for(int i=0; i<length; i++){
            if(arrayListContainer[i] == data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(String data){
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
    public String remove(){
        String oldValue = arrayListContainer[length - 1];
        arrayListContainer[--length] = null;
        return oldValue;
    }
    public String remove(int index){
        if(index >= length || index < 0){
            throw new ArrayIndexOutOfBoundsException("Not valid index number : " + index);
        }
        String oldValue = arrayListContainer[index];
        arrayListContainer[index] = null;
        length--;
        return oldValue;
    }
    public String set(int index, String element) {
        if (index >= length || index < 0)
            throw new IndexOutOfBoundsException("Not valid index number : " + index);

        String oldValue = arrayListContainer[index];
        arrayListContainer[index] = element;
        return oldValue;
    }
    public String get(int index){
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
            if(arrayListContainer[i] != null){
                result += arrayListContainer[i] + ", ";
            }
        }
        //Remove last ,
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
        String[] newContainer;
        newContainer = Arrays.copyOf(arrayListContainer, newCapacity);
        arrayListContainer = newContainer;
        this.capacity = newCapacity;
    }
}
