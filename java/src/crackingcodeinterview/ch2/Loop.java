package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Loop {

    private Loop() { }

    // O(N^2)
    public static Node<Integer> findLoopBySearching(LinkedList<Integer> list) {

        int posAtual = 0;
        Node<Integer> node = list.head;
        while (node != null) {
            int posFirst = findPosFirst(list, node);
            if (posFirst < posAtual) {
                return node;
            }
            node = node.getNext();
            posAtual++;
        }

        return node;

    }

    private static int findPosFirst(LinkedList<Integer> list, Node<Integer> target) {
        Node<Integer> node = list.head;
        int pos = 0;
        while (node != null) {
            if (node.getValue().equals(target.getValue())) {
                return pos;
            }
            node = node.getNext();
            pos++;
        }
        return pos;
    }

    public static Node<Integer> findLoopWithRunner(LinkedList<Integer> list) {
        Node<Integer> slow = list.head;
        Node<Integer> fast = list.head;

        boolean hasCollision = false;
        while (fast != null && fast.getValue() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
            if (slow == fast) {
                hasCollision = true;
                break;
            }
        }

        if (!hasCollision) {
            return null;
        }

        slow = list.head;
        while (slow != fast) {
            slow = slow.getNext();
            fast = fast.getNext();
        }

        return fast;

    }

}
