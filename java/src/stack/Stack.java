package stack;

public class Stack<T> {

    private StackNode<T> top;

    public Stack() {
        this.top = null;
    }

    public StackNode<T> pop() {
        if (top == null) {
            return null;
        }

        StackNode<T> node = top;
        top = top.getNext();
        return node;
    }

    public void push(T value) {
        StackNode<T> node = new StackNode<>(value);
        node.setNext(top);
        top = node;
    }

    public StackNode<T> peek() {
        return top;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        StackNode<T> node = top;
        int size = 0;
        while (node != null) {
            size++;
            node = node.getNext();
        }
        return size;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack empty");
            return;
        }

        StackNode<T> node = top;
        while (node != null) {
            System.out.printf("%s -> ", node);
            node = node.getNext();
        }
        System.out.println("END");
    }
}
