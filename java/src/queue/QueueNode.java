package queue;

public class QueueNode<T> {

    private T value;
    private QueueNode<T> next;

    public QueueNode(T value) {
        this.value = value;
        this.next = null;
    }

    public T getValue() {
        return value;
    }

    public QueueNode<T> getNext() {
        return next;
    }

    public void setNext(QueueNode<T> next) {
        this.next = next;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    @Override
    public String toString() {
        return String.format("Value: %s", value);
    }
}
