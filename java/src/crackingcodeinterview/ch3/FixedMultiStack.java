package crackingcodeinterview.ch3;

import java.util.Arrays;

public class FixedMultiStack {

    private int stackNumber;
    private int stackCapacity;
    private int[] values;
    private int[] stacksSize;

    public FixedMultiStack(int stackNumber, int stackCapacity) {
        this.stackNumber = stackNumber;
        this.stackCapacity = stackCapacity;
        this.values = new int[stackNumber * stackCapacity];
        this.stacksSize = new int[stackNumber];
    }

    public boolean isFull(int stackPos) {
        return this.stacksSize[stackPos] == this.stackCapacity;
    }

    public boolean isEmpty(int stackPos) {
        return this.stacksSize[stackPos] == 0;
    }

    public int getTopPos(int stackPos) {
        int offset = stackPos * this.stackCapacity;
        int size = this.stacksSize[stackPos];
        System.out.printf("%s - %s - %s%n", offset, size, offset + size - 1);
        return offset + size - 1;
    }

    public void push(int stackPos, int value) {

        if (isFull(stackPos)) {
            System.out.printf("Stack at #%s is full%n", stackPos);
            return;
        }

        this.stacksSize[stackPos]++;
        int valuePos = getTopPos(stackPos);
        this.values[valuePos] = value;

    }

    public int pop(int stackPos) {
        if (isEmpty(stackPos)) {
            System.out.printf("Stack at #%s is empty%n", stackPos);
            return -1;
        }

        int valuesPos = getTopPos(stackPos);
        int value = this.values[valuesPos];
        this.values[valuesPos] = 0;
        this.stacksSize[stackPos]--;
        return value;

    }

    public int peek(int stackPos) {
        if (isEmpty(stackPos)) {
            System.out.printf("Stack at #%s is empty%n", stackPos);
            return -1;
        }

        int valuesPos = getTopPos(stackPos);
        System.out.printf("POS %s%n", valuesPos);
        return this.values[valuesPos];

    }

    public void print() {
        for (int i = 0; i < this.values.length; i++) {
            System.out.printf("%02d : %s | ", i, this.values[i]);
            if ((i+1) % stackCapacity == 0) {
                System.out.println();
            }
        }
    }

}
