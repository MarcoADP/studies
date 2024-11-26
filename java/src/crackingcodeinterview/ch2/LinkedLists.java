package crackingcodeinterview.ch2;

import linkedlist.LinkedList;

import static crackingcodeinterview.ch2.FindKElement.findKElementToLastFindingLength;
import static crackingcodeinterview.ch2.FindKElement.findKElementToLastRecursive;

public class LinkedLists {

    public static void main(String[] args) {
        //removeDuplicates();
        findKElementToLast();
    }

    private static void findKElementToLast() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("\nFind k element to the last by finding the length of the linked list");
        for (int i = 0; i <= list.size()-1; i++) {
            System.out.printf("%s -- %s%n", i, findKElementToLastFindingLength(list, i));
        }

        System.out.println("\nFind k element to the last recursive");
//        System.out.printf("%s -- %s%n", 2, findKElementToLastRecursive(list, 1));
        for (int i = 0; i <= list.size()-1; i++) {
            System.out.printf("%s -- %s%n", i, findKElementToLastRecursive(list, i));
        }


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
