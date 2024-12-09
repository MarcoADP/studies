package binarytree;

import linkedlist.LinkedList;

public abstract class BinaryTreeAbstract {

    TreeNode root;

    public abstract void insert(int value);

    protected int getHeight(TreeNode node) {
        return (node == null) ? 0 : node.height;
    }

    public void print() {

        System.out.println("\nPrinting Tree");
        if (root == null) {
            System.out.println("Tree empty");
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int height = 1;
        while (!queue.isEmpty()) {

            int levelSize = queue.size();
            System.out.printf("Level %s => ", height);
            for (int i = 0; i < levelSize; i++) {

                if (queue.isEmpty()) {
                    return;
                }

                TreeNode node = queue.poll();
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

    private int getValue(TreeNode node) {
        return node == null ? -1 : node.value;
    }

    public boolean search(int value) {
        return searchNode(root, value);
    }

    private boolean searchNode(TreeNode root, int value) {
        if (root == null || root.value == value) {
            return root != null;
        }

        if (value < root.value) {
            return searchNode(root.left, value);
        } else {
            return searchNode(root.right, value);
        }
    }

}
