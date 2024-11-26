package crackingcodeinterview.ch2;

import linkedlist.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
        removeDuplicates();
    }

    private static void removeDuplicates() {

        System.out.println("\nRemoving duplicates in an unordered linked list using a hash set");
        LinkedList<Integer> list = getIntegerLinkedList();
        list.print();
        RemoveDuplicates.removeDuplicateWithSet(list);
        list.print();

        System.out.println("\nRemoving duplicates in an unordered linked list using a runner node");
        list = getIntegerLinkedList();
        list.print();
        RemoveDuplicates.removeDuplicateWithRunner(list);
        list.print();
    }

    private static LinkedList<Integer> getIntegerLinkedList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);
        return list;
    }

}
