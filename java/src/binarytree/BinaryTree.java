package binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    BTNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private BTNode insertRecursive(BTNode node, int value) {
        if (node == null) {
            return new BTNode(value);
        }

        if (value < node.value) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.value) {
            node.right = insertRecursive(node.right, value);
        }

        return node;

    }

    public void print() {
        if (root == null) {
            System.out.println("Tree empty");
        }

        Queue<BTNode> queue = new LinkedList<>();
        queue.add(root);

        int height = 1;
        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            System.out.printf("Height %s => ", height);
            for (int i = 0; i < levelSize; i++) {

                BTNode node = queue.poll();
                System.out.printf("%s [%s|%s] \t", node.value, node.left, node.right);

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

}
