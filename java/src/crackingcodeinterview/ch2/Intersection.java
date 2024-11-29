package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class Intersection {

    public static Node<Integer> findIntersectionByRemovingElements(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        LinkedList<Integer> biggerList = list1.size() > list2.size() ? list1 : list2;
        LinkedList<Integer> smallerList = list1.size() > list2.size() ? list2 : list1;
        int dif = biggerList.size() - smallerList.size();

        for (int i = 0; i < dif; i++) {
            biggerList.poll();
        }

        Node<Integer> node1 = biggerList.head;
        Node<Integer> node2 = smallerList.head;
        while (node1 != node2) {
            node1 = node1.getNext();
            node2 = node2.getNext();
        }

        return node1;
    }

    public static Node<Integer> findIntersectionByOffsetBiggerList(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        LinkedList<Integer> biggerList = list1.size() > list2.size() ? list1 : list2;
        LinkedList<Integer> smallerList = list1.size() > list2.size() ? list2 : list1;
        int dif = biggerList.size() - smallerList.size();

        Node<Integer> node1 = biggerList.head;
        Node<Integer> node2 = smallerList.head;

        for (int i = 0; i < dif; i++) {
            node1 = node1.getNext();
        }

        while (node1 != node2) {
            node1 = node1.getNext();
            node2 = node2.getNext();
        }

        return node1;
    }


}
