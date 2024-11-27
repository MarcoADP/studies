package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

public class SumLinkedinList {

    private SumLinkedinList() { }

    public static LinkedList<Integer> sumReverse(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        LinkedList<Integer> result = new LinkedList<>();
        Node<Integer> node1 = list1.head;
        Node<Integer> node2 = list2.head;
        int increment = 0;
        while (node1 != null || node2 != null) {

            int value1 = node1 == null ? 0 : node1.getValue();
            int value2 = node2 == null ? 0 : node2.getValue();

            int soma = value1 + value2 + increment;
            increment = soma >= 10 ? 1 : 0;
            int resto = soma % 10;
            result.add(resto);

            node1 = node1 == null ? null : node1.getNext();
            node2 = node2 == null ? null : node2.getNext();

        }

        return result;
    }

    public static LinkedList<Integer> sum(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        equalizeListsSize(list1, list2);

        PartialSum sum = sumHelper(list1.head, list2.head);
        LinkedList<Integer> result = new LinkedList<>();
        result.head = sum.sum;
        if (sum.increment > 0) {
             result.addBegin(sum.increment);
        }
        return result;
    }

    private static void equalizeListsSize(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        int dif = list1.size() - list2.size();
        if (dif > 0) {
            padList(list2, dif);
        } else {
            padList(list1, -1 * dif);
        }
    }

    private static PartialSum sumHelper(Node<Integer> node1, Node<Integer> node2) {
        if (node1 == null && node2 == null) {
            return new PartialSum();
        }

        PartialSum sum = sumHelper(node1.getNext(), node2.getNext());
        int value = node1.getValue() + node2.getValue() + sum.increment;
        Node<Integer> result = new Node<>(value % 10);
        result.setNext(sum.sum);

        sum.sum = result;
        sum.increment = value / 10;
        return sum;

    }

    private static void padList(LinkedList<Integer> list, int dif) {
        for (int i = 0; i < dif; i++) {
            list.addBegin(0);
        }
    }

}

class PartialSum {
    Node<Integer> sum = null;
    int increment = 0;
}
