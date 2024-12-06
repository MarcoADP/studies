package crackingcodeinterview.ch3;

import stack.Stack;
import stack.StackNode;

public class SortedStack {

    private SortedStack() { }

    public static void sort(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) {
            StackNode<Integer> node = stack.pop();
            while (!temp.isEmpty() && temp.peek().getValue() > node.getValue()) {
                stack.push(temp.pop().getValue());
            }
            temp.push(node.getValue());
        }

        while (!temp.isEmpty()) {
            stack.push(temp.pop().getValue());
        }

    }

}
