import binarytree.AVLTree;
import binarytree.BinaryTree;
import linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        //createLinkedList();
        createBinaryTree();
        createAvlTree();

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
}