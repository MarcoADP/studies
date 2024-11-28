package linkedlist;

public class LinkedList<T> {

    public Node<T> head;

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

    public void addBegin(T value) {
        Node<T> newHead = new Node<>(value);
        newHead.setNext(head);
        head = newHead;
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

    public void remove(Node<T> node) {
        if (node != null && node.next != null) {
            Node<T> next = node.getNext();
            node.setValue(next.getValue());
            node.setNext(next.getNext());
        }
    }

    public void print() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
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

    public boolean isEqual(LinkedList<T> other) {

        if (this.size() != other.size()) {
            return false;
        }

        Node<T> node = this.head;
        Node<T> otherNode = other.head;
        while (node != null && otherNode != null) {
            if (!node.getValue().equals(otherNode.getValue())) {
                return false;
            }
            node = node.getNext();
            otherNode = otherNode.getNext();
        }

        return true;
    }

}
