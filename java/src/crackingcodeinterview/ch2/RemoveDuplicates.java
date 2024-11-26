package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

import java.util.HashSet;

public class RemoveDuplicates {

    private RemoveDuplicates() { }

    public static void removeDuplicateWithSet(LinkedList<Integer> list) {

        Node<Integer> currentNode = list.head;
        Node<Integer> previousNode = null;
        HashSet<Integer> set = new HashSet<>();
        while (currentNode != null) {
            if (set.contains(currentNode.getValue())) {
                previousNode.setNext(currentNode.getNext());
            } else {
                set.add(currentNode.getValue());
                previousNode = currentNode;
            }
            currentNode = currentNode.getNext();
        }
    }

    public static void removeDuplicateWithRunner(LinkedList<Integer> list) {
        Node<Integer> currentNode = list.head;
        while (currentNode != null) {
            Node<Integer> runnerNode = currentNode;
            while (runnerNode.getNext() != null) {
                if (currentNode.getValue().equals(runnerNode.getNext().getValue())) {
                    runnerNode.setNext(runnerNode.getNext().getNext());
                } else {
                    runnerNode = runnerNode.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }
    }

}
