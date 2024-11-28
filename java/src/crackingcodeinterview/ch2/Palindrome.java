package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Palindrome {

    public static boolean isPalindromeReverse(LinkedList<Integer> list) {

        LinkedList<Integer> reverseList = new LinkedList<>();
        Node<Integer> currentNode = list.head;
        while (currentNode != null) {
            reverseList.addBegin(currentNode.getValue());
            currentNode = currentNode.getNext();
        }

        return list.isEqual(reverseList);

    }

}
