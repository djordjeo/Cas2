package sample.pkg;

import java.util.Arrays;

public class Stack {

    private int[] elements;
    private int head;

    public Stack(){
        elements = new int[5];
        head = 0;
    }

    public Stack(int n){
        elements = new int[n];
        head =0;
    }

    public int[] getElements() {
        return elements;
    }

    public int getHead() {
        return head;
    }

    public void push(int v){
        checkCapacity();
        elements[head++] = v;
    }

    private int size(){
        return head;
    }

    private int capacity(){
        return elements.length;
    }

    private void checkCapacity(){
        if(size() == capacity()){
            System.out.println("Stack overflow, resizing");
            elements = Arrays.copyOf(elements,2*elements.length);
        }
    }

    public int pop(){
        if(isEmpty()) {
            return 0;
        }
        head--;
        int tmp = elements[head];
        elements[head] = 0;
        return tmp;
    }

    public boolean isEmpty(){
        if(size() == 0){
            System.out.println("Stack underflow");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) + "}" + "\n" +
                "size: " + size() + " capacity: " + capacity();
    }
}
