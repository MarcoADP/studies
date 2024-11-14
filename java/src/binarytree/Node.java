package binarytree;

public class Node {

    int value;
    int height;

    Node left;
    Node right;

    public Node(int value) {
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
