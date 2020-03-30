package sample;

import java.util.Arrays;

class sample {
    private final int SIZE = 10;
    private int[] stackArray;
    private int top;

    public void DZ2() {
        stackArray = new int[SIZE];
        top = -1;
    }

    public void addElement(int element) {
        stackArray[++top] = element;
    }

    public boolean isFull() {
        return (top == SIZE - 1);
    }

    @Override
    public String toString() {
        return "Stack = {" + Arrays.toString(stackArray) + '}';
    }
}