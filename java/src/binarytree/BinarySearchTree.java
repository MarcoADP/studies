package binarytree;

public class BinarySearchTree extends BinaryTreeAbstract {

    @Override
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    protected TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(value);
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

    public boolean isSameTree(BinarySearchTree otherTree) {
        return isSameNode(root, otherTree.root);
    }

    private boolean isSameNode(TreeNode node1, TreeNode node2) {

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
