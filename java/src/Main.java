import binarytree.AVLTree;
import binarytree.BinaryTree;
import linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        //createBinaryTree();
        //createAvlTree();
        createLinkedList();

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
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.print("After creating a list: ");
        lista.print();

        lista.remove(20);
        System.out.print("After removing the value 20: ");
        lista.print();

        lista.remove(40);
        System.out.print("After removing the value 40: ");
        lista.print();

        lista.add(50);
        System.out.print("After adding the value 50: ");
        lista.print();
    }
}