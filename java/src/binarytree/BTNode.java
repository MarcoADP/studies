package binarytree;

public class BTNode {

    int value;

    BTNode left;

    BTNode right;

    public BTNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
