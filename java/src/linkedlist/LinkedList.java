package linkedlist;

public class LinkedList<T> {

    private Node<T> head;

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void remove(T value) {
        if (head == null) {
            return;
        }

        if (head.value.equals(value)) {
            head = head.next;
        }

        Node<T> currentNode = head;
        while (currentNode.next != null && !currentNode.next.value.equals(value)) {
            currentNode = currentNode.next;
        }

        if (currentNode.next != null) {
            currentNode.next = currentNode.next.next;
        }

    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null\n");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        }
        int size = 1;

        Node<T> currentNode = head;
        while (currentNode.next != null) {
            size += 1;
            currentNode = currentNode.next;
        }

        return size;
    }

    public T poll() {

        if (isEmpty()) {
            return null;
        }

        Node<T> node = head;
        head = head.next;
        return node.value;
    }
}
