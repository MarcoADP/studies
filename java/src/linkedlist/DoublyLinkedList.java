package linkedlist;

public class DoublyLinkedList<T> {

    private DoublyNode<T> head = null;
    private DoublyNode<T> tail = null;

    public void addBegin(T value) {
        DoublyNode<T> node = new DoublyNode<>(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            head.setPrev(node);
            DoublyNode<T> aux = head;
            head = node;
            head.setNext(aux);
        }
    }

    public void addEnd(T value) {
        DoublyNode<T> node = new DoublyNode<>(value);
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            DoublyNode<T> aux = tail;
            tail = node;
            tail.setPrev(aux);
        }
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        DoublyNode<T> current = head;
        while (current != null) {
            System.out.printf("%s [%s,%s] -> ", current.getValue(), current.showPrevValue(), current.showNextValue());
            current = current.getNext();
        }
        System.out.println("END");
    }

    public void printReverse() {
        DoublyNode<T> current = tail;
        while (current != null) {
            System.out.printf("%s [%s,%s] -> ", current.getValue(), current.showPrevValue(), current.showNextValue());
            current = current.getPrev();
        }
        System.out.println("BEGIN");
    }

}
