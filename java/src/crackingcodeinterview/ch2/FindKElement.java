package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class FindKElement {

    public static Node<Integer> findKElementToLastFindingLength(LinkedList<Integer> list, int k) {

        Node<Integer> currentNode = list.head;
        int length = 1;
        while (currentNode.getNext() != null) {
            length++;
            currentNode = currentNode.getNext();
        }
        Node<Integer> node = list.head;
        for (int i = 1; i < length - k; i++) {
            node = node.getNext();
        }

        return node;
    }

    public static Node<Integer> findKElementToLastRecursive(LinkedList<Integer> list, Integer k) {
        Index index = new Index();
        index.value = 0;
        return findKElementToLastNodeRecursive(list.head, k, index);
    }

    private static Node<Integer> findKElementToLastNodeRecursive(Node<Integer> currentNode, int k, Index index) {
        if (currentNode == null) {
            return null;
        }
        Node<Integer> node = findKElementToLastNodeRecursive(currentNode.getNext(), k, index);
        index.value = index.value + 1;
        if (index.value == k + 1) {
            return currentNode;
        }
        return node;
    }

}
