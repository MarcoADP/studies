
package queue;

public class Queue<T> {

    private QueueNode<T> first;
    private QueueNode<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public void add(T value) {
        QueueNode<T> node = new QueueNode<>(value);
        if (last != null) {
            last.setNext(node);
        }
        last = node;

        if (first == null) {
            first = last;
        }

    }

    public QueueNode<T> remove() {
        if (first == null) {
            return null;
        }

        QueueNode<T> node = first;
        first = node.getNext();

        if (first == null) {
            last = null;
        }

        return node;
    }

    public QueueNode<T> peek() {
        return first;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue empty");
            return;
        }

        QueueNode<T> node = first;
        while (node != null) {
            System.out.printf("%s -> ", node);
            node = node.getNext();
        }
        System.out.println("END");
    }
}
