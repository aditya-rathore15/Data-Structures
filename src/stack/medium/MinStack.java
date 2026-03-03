package stack.medium;

import java.util.Stack;

/*
Leetcode 155. Min Stack
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {
    private Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
    }

    public int pop() {
        return stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int min = stack.peek();

        while(!stack.isEmpty()) {
            min = Math.min(min, stack.peek());
            temp.push(stack.pop());
        }

        while(!temp.isEmpty()) {
            stack.push(temp.pop());
        }

        return min;
    }
}