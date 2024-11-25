package linkedlist;

public class DoublyNode<T> {

    private T value;
    private DoublyNode<T> next;
    private DoublyNode<T> prev;

    DoublyNode(T value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public T getValue() {
        return value;
    }

    public DoublyNode<T> getNext() {
        return next;
    }

    public DoublyNode<T> getPrev() {
        return prev;
    }

    public void setNext(DoublyNode<T> next) {
        this.next = next;
    }

    public void setPrev(DoublyNode<T> prev) {
        this.prev = prev;
    }

    public T showNextValue() {
        if (next != null) {
            return next.value;
        }
        return null;
    }

    public T showPrevValue() {
        if (prev != null) {
            return prev.value;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

}
