package crackingcodeinterview.ch2;

import linkedlist.LinkedList;
import linkedlist.Node;

import static crackingcodeinterview.ch2.FindKElement.findKElementToLastFindingLength;
import static crackingcodeinterview.ch2.FindKElement.findKElementToLastRecursive;

public class LinkedLists {

    public static void main(String[] args) {
        //removeDuplicates();
        //findKElementToLast();
        //partition();
        //sumLinkedListReverse();
        //sumLinkedList();
        isPalindrome();
    }

    private static void isPalindrome() {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(1);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(3);
        list2.add(2);
        list2.add(1);

        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(1);

        System.out.println("\nCheck if it's palindrome by reversing the second linked list");

        list1.print();
        System.out.printf("PALINDROME? %s%n", Palindrome.isPalindromeReverse(list1) ? "YES" : "NO");

        list2.print();
        System.out.printf("PALINDROME? %s%n", Palindrome.isPalindromeReverse(list2) ? "YES" : "NO");

        list3.print();
        System.out.printf("PALINDROME? %s%n", Palindrome.isPalindromeReverse(list3) ? "YES" : "NO");

    }

    private static void sumLinkedList() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(6);
        list1.add(1);
        list1.add(7);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(9);
        list2.add(5);
        System.out.println("\nSum Linked Lists");
        list1.print();
        list2.print();
        LinkedList<Integer> result = SumLinkedinList.sum(list1, list2);
        result.print();

        list1 = new LinkedList<>();
        list1.add(9);
        list1.add(0);

        list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(0);

        System.out.println("\nSum Linked Lists");
        list1.print();
        list2.print();
        result = SumLinkedinList.sum(list1, list2);
        result.print();

        System.out.println("\nSum Linked Lists in reverse order");
        list1.print();
        list2.print();
        result = SumLinkedinList.sumReverse(list1, list2);
        result.print();

        list1 = new LinkedList<>();
        list1.add(7);
        list1.add(9);
        list1.add(9);

        list2 = new LinkedList<>();
        list2.add(2);

        System.out.println("\nSum Linked Lists");
        list1.print();
        list2.print();
        result = SumLinkedinList.sum(list1, list2);
        result.print();
    }

    private static void sumLinkedListReverse() {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(7);
        list1.add(1);
        list1.add(6);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(5);
        list2.add(9);
        list2.add(2);

        System.out.println("\nSum Linked Lists in reverse order");
        list1.print();
        list2.print();
        LinkedList<Integer> result = SumLinkedinList.sumReverse(list1, list2);
        result.print();

        list1 = new LinkedList<>();
        list1.add(0);
        list1.add(9);

        list2 = new LinkedList<>();
        list2.add(0);
        list2.add(2);
        list2.add(1);

        System.out.println("\nSum Linked Lists in reverse order");
        list1.print();
        list2.print();
        result = SumLinkedinList.sumReverse(list1, list2);
        result.print();

        list1 = new LinkedList<>();
        list1.add(9);
        list1.add(9);
        list1.add(7);

        list2 = new LinkedList<>();
        list2.add(2);

        System.out.println("\nSum Linked Lists in reverse order");
        list1.print();
        list2.print();
        result = SumLinkedinList.sumReverse(list1, list2);
        result.print();
    }

    private static void partition() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(5);
        list.add(10);
        list.add(2);
        list.add(1);

        list.print();

        int n = 5;
        System.out.println("\nPartition list by adding elements at begin and end of a new linked list");
        LinkedList<Integer> newList = Partition.partitionNewList(list, n);
        newList.print();

        System.out.println("\nPartition list by creating two linked lists");
        newList = Partition.partitionTwoNewLists(list, n);
        newList.print();

        System.out.println("\nPartition list using only Node");
        Node<Integer> node = Partition.partitionUsingNode(list.head, n);
        newList = new LinkedList<>();
        newList.head = node;
        newList.print();

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
