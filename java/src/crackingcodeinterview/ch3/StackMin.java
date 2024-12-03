package crackingcodeinterview.ch3;

import stack.Stack;
import stack.StackNode;

public class StackMin extends Stack<Integer> {

    private Stack<Integer> stackMin;

    public StackMin() {
        super();
        this.stackMin = new Stack<>();
    }

    public void push(int value) {

        int min = min();
        if (value <= min) {
            stackMin.push(value);
        }

        super.push(value);
    }

    public StackNode<Integer> pop() {
        if (this.isEmpty()) {
            return null;
        }
        StackNode<Integer> node = super.pop();
        int min = min();
        if (node.getValue().equals(min)) {
            stackMin.pop();
        }
        return node;
    }

    public Integer min() {
        if (stackMin.isEmpty()) {
            return java.lang.Integer.MAX_VALUE;
        }
        return stackMin.peek().getValue();
    }

    public void print() {
        System.out.printf("MIN: %s | ", min());
        super.print();
    }

}
