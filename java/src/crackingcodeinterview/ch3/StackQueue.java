package crackingcodeinterview.ch3;

import crackingcodeinterview.ch1.*;
import tuple.Tuple;

import java.util.ArrayList;
import java.util.List;

public class StackQueue {

    public static final String ANSWER_FORMAT = "%s => %s%n";

    public static void main(String[] args) {

        //createFixedMultiStacks();
        //createStackMin();
        //createPlatesStack();
        createQueueWithStack();
    }

    private static void createQueueWithStack() {
        QueueWithStacks<Integer> queue = new QueueWithStacks<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.print();
        queue.remove();
        queue.add(4);
        queue.print();
        queue.add(5);
        queue.add(6);
        queue.remove();
        queue.print();
    }

    private static void createPlatesStack() {

        PlatesStack<Integer> stack = new PlatesStack<>(3);
        stack.pop();
        stack.popAt(0);
        stack.popAt(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(11);
        stack.print();
        stack.popAt(0);
        stack.print();
        stack.popAt(0);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.popAt(2);
        stack.print();

    }

    private static void createStackMin() {
        StackMin stack = new StackMin();
        stack.print();
        stack.push(1);
        stack.push(2);
        stack.push(0);
        stack.push(3);
        stack.push(1);
        stack.print();
        stack.pop();
        stack.pop();
        stack.print();
        stack.pop();
        stack.print();
        stack.push(-1);
        stack.print();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print();
    }

    private static void createFixedMultiStacks() {

        FixedMultiStack stack = new FixedMultiStack(4, 8);
        stack.push(1, 1);
        stack.push(1, 2);
        stack.push(1, 3);
        stack.push(1, 4);
        stack.push(1, 5);
        stack.push(1, 6);
        stack.push(1, 7);
        stack.push(1, 8);
        stack.push(1, 9);
        stack.push(1, 10);
        stack.push(1, 11);
        stack.push(1, 11);
        stack.push(0, 1);
        stack.pop(1);
        stack.print();
        System.out.println(stack.peek(1));
        System.out.println(stack.peek(0));
        System.out.println(stack.peek(2));
        System.out.println(stack.peek(3));

    }


}
