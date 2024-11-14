import binarytree.AVLTree;
import binarytree.BinaryTree;

public class Main {

    public static void main(String[] args) {

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
}