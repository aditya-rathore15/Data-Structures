package Queue;

import java.util.Stack;

public class ImplementQueueUsingStack {
    private Stack<Integer> inputStack = new Stack<>();
    private Stack<Integer> outputStack = new Stack<>();

    public ImplementQueueUsingStack() {}

    public void push(int x) {
        inputStack.push(x);
    }

    public int pop() {
        transferElements();
        return outputStack.pop();
    }

    public int peek() {
        transferElements();
        return outputStack.peek();
    }

    public boolean empty() {
        return inputStack.empty() && outputStack.empty();
    }

    public void transferElements() {
        if(outputStack.empty()) {
            while(!inputStack.empty()) {
                outputStack.push(inputStack.pop());
            }
        }
    }


    public static void main(String[] args) {
        ImplementQueueUsingStack queue = new ImplementQueueUsingStack();
        queue.push(1);
        queue.push(2);
        queue.pop();
        queue.peek();
    }
}
