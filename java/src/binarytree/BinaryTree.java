package binarytree;

import queue.Queue;

public class BinaryTree extends BinaryTreeAbstract {

    @Override
    public void insert(int value) {

        TreeNode node = new TreeNode(value);

        if (root == null) {
            root = node;
            return;
        }

        Queue<TreeNode> queue = new Queue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove().getValue();

            if (currentNode.left == null) {
                currentNode.left = node;
                return;
            } else {
                queue.add(currentNode.left);
            }

            if (currentNode.right == null) {
                currentNode.right = node;
                return;
            } else {
                queue.add(currentNode.right);
            }

        }

    }
}
