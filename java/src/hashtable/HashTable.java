package hashtable;

import linkedlist.LinkedList;
import linkedlist.Node;

public class HashTable<K, V> {

    public int getSize() {
        return size;
    }

    private static class HashNode<K, V> {
        K key;
        V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "HashNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private final LinkedList<HashNode<K, V>>[] buckets;
    private final int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new LinkedList[capacity];
        this.size = 0;
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    private int getBucketIndex(K key) {
        int hashCode = key.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    public void put(K key, V value) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[bucketIndex];

        Node<HashNode<K, V>> currentNode = bucket.head;
        while (currentNode != null) {
            if (currentNode.getValue().key.equals(key)) {
                currentNode.getValue().value = value;
                return;
            }
            currentNode = currentNode.getNext();
        }

        bucket.add(new HashNode<>(key, value));
        size++;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[bucketIndex];

        Node<HashNode<K, V>> currentNode = bucket.head;
        while (currentNode != null) {
            if (currentNode.getValue().key.equals(key)) {
                return currentNode.getValue().value;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        LinkedList<HashNode<K, V>> bucket = buckets[bucketIndex];

        Node<HashNode<K, V>> currentNode = bucket.head;
        while (currentNode != null) {
            if (currentNode.getValue().key.equals(key)) {
                bucket.remove(currentNode.getValue());
                size--;
                return currentNode.getValue().value;
            }
            currentNode = currentNode.getNext();
        }

        return null;
    }

    public void print() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.printf("[%s] => ", i);
            buckets[i].print();
        }
    }
}
