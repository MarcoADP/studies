package binarytree;

import linkedlist.LinkedList;

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

        LinkedList<Node> queue = new LinkedList<>();
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

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(Node root, int value) {
        if (root == null || root.value == value) {
            return root != null;
        }

        if (value < root.value) {
            return searchNode(root.left, value);
        } else {
            return searchNode(root.right, value);
        }
    }

    public boolean isSameTree(BinaryTree otherTree) {
        return isSameNode(root, otherTree.root);
    }

    private boolean isSameNode(Node node1, Node node2) {

        if (node1 == null && node2 == null) {
            return true;
        }

        if (node1 == null || node2 == null) {
            return false;
        }

        if (node1.value != node2.value) {
            return false;
        }

        return isSameNode(node1.left, node2.left) && isSameNode(node1.right, node2.right);
    }
}
