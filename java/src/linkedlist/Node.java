package linkedlist;

public class Node<T> {

    T value;
    Node<T> next;

    Node(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
