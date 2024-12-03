package crackingcodeinterview.ch3;

import crackingcodeinterview.ch1.*;
import tuple.Tuple;

import java.util.ArrayList;
import java.util.List;

public class StackQueue {

    public static final String ANSWER_FORMAT = "%s => %s%n";

    public static void main(String[] args) {

        createFixedMultiStacks();
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
