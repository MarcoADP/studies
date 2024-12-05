package crackingcodeinterview.ch3;

import stack.Stack;
import stack.StackNode;

public class QueueWithStacks<T> {

    private Stack<T> newestStack;

    private Stack<T> oldestStack;

    public QueueWithStacks() {
        this.newestStack = new Stack<>();
        this.oldestStack = new Stack<>();
    }

    public int size() {
        return this.newestStack.size() + this.oldestStack.size();
    }

    public void add(T value) {
        this.newestStack.push(value);
    }

    private void shiftStacks() {
        if (oldestStack.isEmpty()) {
            while (!newestStack.isEmpty()) {
                oldestStack.push(newestStack.pop().getValue());
            }
        }
    }

    public T peek() {
        shiftStacks();
        return oldestStack.isEmpty() ? null : oldestStack.peek().getValue();
    }

    public T remove() {
        shiftStacks();
        return oldestStack.isEmpty() ? null : oldestStack.pop().getValue();
    }

    public void print() {
        Stack<T> aux = new Stack<>();
        StackNode<T> node = newestStack.peek();
        while (node != null) {
            aux.push(node.getValue());
            node = node.getNext();
        }

        node = oldestStack.peek();
        while (node != null) {
            System.out.printf("%s -> ", node);
            node = node.getNext();
        }
        node = aux.peek();
        while (node != null) {
            System.out.printf("%s -> ", node);
            node = node.getNext();
        }
        System.out.println("END");
    }

}
