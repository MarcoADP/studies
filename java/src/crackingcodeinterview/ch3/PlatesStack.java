package crackingcodeinterview.ch3;

import stack.Stack;
import stack.StackNode;

import java.util.ArrayList;
import java.util.List;

public class PlatesStack<T> {

    List<Stack<T>> stacks;
    int capacity;

    public PlatesStack(int capacity) {
        this.stacks = new ArrayList<>();
        this.capacity = capacity;
    }

    public Stack<T> getCurrentStack() {
        if (stacks.isEmpty()) {
            return null;
        }

        return stacks.getLast();
    }

    public void push(T value) {

        Stack<T> current = getCurrentStack();
        if (current == null || current.size() == capacity) {
            current = new Stack<>();
            stacks.add(current);
        }

        current.push(value);

    }

    public StackNode<T> pop() {
        Stack<T> current = getCurrentStack();
        if (current == null) {
            System.out.println("Stack empty");
            return null;
        }
        StackNode<T> value = current.pop();
        if (current.isEmpty()) {
            stacks.remove(current);
        }
        return value;
    }

    public StackNode<T> popAt(int n) {
        if (stacks.size() <= n) {
            System.out.printf("There is no stack at #%s%n", n);
            return null;
        }
        Stack<T> current = stacks.get(n);
        StackNode<T> node = current.pop();
        shiftStacks(n);
        return node;
    }

    private void shiftStacks(int n) {
        int stacksToEnd = stacks.size() - n - 1;
        for (int i = 0; i < stacksToEnd; i++) {
            System.out.printf("%s - %s%n", n+i, n+i+1);
            Stack<T> target = stacks.get(n+i);
            Stack<T> current = stacks.get(n+i+1);
            StackNode<T> node = removeBottom(current);
            target.push(node.getValue());
        }

        if (stacksToEnd == 0) {
            Stack<T> stack = stacks.get(n);
            if (stack.isEmpty()) {
                stacks.remove(stack);
            }
        }

    }

    private StackNode<T> removeBottom(Stack<T> current) {
        StackNode<T> node = current.peek();
        StackNode<T> last = null;
        while (node.hasNext()) {
            last = node;
            node = node.getNext();
        }

        StackNode<T> removed;
        if (last == null) {
            removed = current.pop();
            stacks.remove(current);
        } else {
            removed = last.getNext();
            last.setNext(null);
        }
        return removed;
    }

    public void print() {
        System.out.println("\nSTACKS:");
        for (int i = 0; i < stacks.size(); i++) {
            System.out.printf("Stack #%s => ", i);
            stacks.get(i).print();
        }
        System.out.println("===================================================");
    }

}
