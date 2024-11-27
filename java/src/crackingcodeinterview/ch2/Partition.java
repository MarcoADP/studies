package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Partition {

    public static LinkedList<Integer> partitionNewList(LinkedList<Integer> list, int n) {
        LinkedList<Integer> newList = new LinkedList<>();
        Node<Integer> currentNode = list.head;
        while (currentNode != null) {
            if (currentNode.getValue() < n) {
                newList.addBegin(currentNode.getValue());
            } else {
                newList.add(currentNode.getValue());
            }
            currentNode = currentNode.getNext();
        }

        return newList;
    }

    public static LinkedList<Integer> partitionTwoNewLists(LinkedList<Integer> list, int n) {
        LinkedList<Integer> smallerNumbers = new LinkedList<>();
        LinkedList<Integer> biggerNumbers = new LinkedList<>();
        Node<Integer> currentNode = list.head;
        while (currentNode != null) {
            if (currentNode.getValue() < n) {
                smallerNumbers.add(currentNode.getValue());
            } else {
                biggerNumbers.add(currentNode.getValue());
            }
            currentNode = currentNode.getNext();
        }

        currentNode = biggerNumbers.head;
        while (currentNode != null) {
            smallerNumbers.add(currentNode.getValue());
            currentNode = currentNode.getNext();
        }

        return smallerNumbers;
    }

    public static Node<Integer> partitionUsingNode(Node<Integer> node, int n) {
        Node<Integer> beforeStart = null;
        Node<Integer> beforeEnd = null;
        Node<Integer> afterStart = null;
        Node<Integer> afterEnd = null;

        while (node != null) {
            Node<Integer> next = node.getNext();
            node.setNext(null);

            if (node.getValue() < n) {
                if (beforeStart == null) {
                    beforeStart = node;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.setNext(node);
                    beforeEnd = node;
                }
            } else {
                if (afterStart == null) {
                    afterStart = node;
                    afterEnd = afterStart;
                } else {
                    afterEnd.setNext(node);
                    afterEnd = node;
                }
            }

            node = next;
        }

        if (beforeStart == null) {
            return afterStart;
        }

        beforeEnd.setNext(afterStart);
        return beforeStart;

    }

}
