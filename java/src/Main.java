import binarytree.AVLTree;
import binarytree.BinaryTree;
import hashtable.HashTable;
import linkedlist.DoublyLinkedList;
import linkedlist.LinkedList;
import queue.Queue;
import stack.Stack;

public class Main {

    public static void main(String[] args) {

        //createLinkedList();
        //createBinaryTree();
        //createAvlTree();
        //createHashTable();
        //createDoublyLinkedList();
        //createStack();
        createQueue();
    }

    private static void createQueue() {
        Queue<Integer> queue = new Queue<>();
        System.out.printf("Removing %s from the queue %n", queue.remove());
        queue.print();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.print();
        System.out.printf("Removing %s from the queue %n", queue.remove());
        System.out.printf("Removing %s from the queue %n", queue.remove());
        System.out.println(queue.peek());
        queue.add(5);
        queue.print();
    }

    private static void createStack() {
        Stack<Integer> stack = new Stack<>();
        System.out.printf("Removing %s from the stack %n", stack.pop());
        stack.print();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.print();
        System.out.printf("Removing %s from the stack %n", stack.pop());
        System.out.printf("Removing %s from the stack %n", stack.pop());
        System.out.println(stack.peek());
        stack.push(5);
        stack.print();
    }

    private static void createDoublyLinkedList() {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.addBegin(1);
        list.addBegin(2);
        list.addEnd(3);
        list.addBegin(4);
        list.addEnd(0);
        list.addBegin(5);
        list.print();
        list.printReverse();
    }

    private static void createBinaryTree() {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(50);
        binaryTree.insert(30);
        binaryTree.insert(70);
        binaryTree.insert(20);
        binaryTree.insert(40);
        binaryTree.insert(60);
        binaryTree.insert(80);
        binaryTree.insert(65);
        binaryTree.insert(25);
        binaryTree.insert(68);
        binaryTree.insert(67);
        binaryTree.insert(69);

        binaryTree.print();
    }

    private static void createAvlTree() {
        AVLTree avlTree = new AVLTree();
        avlTree.insert(10);
        avlTree.insert(20);
        avlTree.insert(30);
        avlTree.insert(40);
        avlTree.insert(50);
        avlTree.insert(25);
        avlTree.print();
    }

    private static void createLinkedList() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("List is empty? " + linkedList.isEmpty());

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        System.out.print("After adding elements: ");
        linkedList.print();
        System.out.println("list is empty? " + linkedList.isEmpty());

        linkedList.remove(20);
        System.out.print("After removing the value 20: ");
        linkedList.print();

        linkedList.remove(40);
        System.out.print("After removing the value 40: ");
        linkedList.print();

        linkedList.add(50);
        System.out.print("After adding the value 50: ");
        linkedList.print();

        linkedList.poll();
        System.out.print("After polling: ");
        System.out.println("list is empty? " + linkedList.isEmpty());
        linkedList.print();

        linkedList.poll();
        System.out.print("After polling: ");
        System.out.println("list is empty? " + linkedList.isEmpty());
        linkedList.print();

        linkedList.poll();
        System.out.print("After polling: ");
        System.out.println("list is empty? " + linkedList.isEmpty());
        linkedList.print();

        linkedList.poll();
        System.out.print("After polling: ");
        System.out.println("list is empty? " + linkedList.isEmpty());
        linkedList.print();
    }

    private static void createHashTable() {
        HashTable<String, String> hashTable = new HashTable<>(10);
        hashTable.put("100", "BBB");
        hashTable.put("1000", "CCC");
        hashTable.put("199", "DDD");
        hashTable.put("199", "EEE");
        hashTable.print();
        System.out.println("Size: " + hashTable.getSize());

        System.out.println("Getting Key 199 => " + hashTable.get("199"));
        System.out.println("Getting Key 200 => " + hashTable.get("200"));

        System.out.println("Removing Key 199 => " + hashTable.remove("199"));
        System.out.println("Removing Key 199 => " + hashTable.remove("199"));

        hashTable.print();
        System.out.println("Size: " + hashTable.getSize());

    }


}