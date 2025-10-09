package org.task3;

public class IntStack {
    private final int max = 1000;
    private int[] stack = new int[max];
    private int index;

    public int pop() {
        if (this.index == 0) {
            return 0;
        }

        return this.stack[--this.index];
    }

    public void push(int item) {
        if (this.index >= this.max) {
            return;
        }

        this.stack[this.index++] = item;
    }

    public int peek() {
        if (this.index == 0) {
            return 0;
        }

        return this.stack[this.index - 1];
    }

    public int size() {
        return this.index;
    }

    public boolean isEmpty() {
        return this.index == 0;
    }

    public void clear() {
        this.index = 0;
        this.stack = new int[this.max];
    }
}
