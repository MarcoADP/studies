package binarytree;

public class TreeNode {

    int value;
    int height;

    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return String.format("V:%s H:%s", this.value, this.height);
    }
}
