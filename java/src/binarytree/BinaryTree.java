package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    protected Node insertRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        } else {
            return node;
        }

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));

        return node;

    }

    protected int getHeight(Node node) {
        return (node == null) ? 0 : node.height;
    }

    public void print() {

        System.out.println("\nPrinting Tree");
        if (root == null) {
            System.out.println("Tree empty");
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int height = 1;
        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            System.out.printf("Level %s => ", height);
            for (int i = 0; i < levelSize; i++) {

                if (queue.isEmpty()) {
                    return;
                }

                Node node = queue.poll();
                System.out.printf("%s [%s | %s] \t", node, getValue(node.left), getValue(node.right));

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }

            }
            System.out.println();
            height += 1;
        }

    }

    private int getValue(Node node) {
        return node == null ? -1 : node.value;
    }
}
