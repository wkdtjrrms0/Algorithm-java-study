import java.io.IOException;
import java.util.Stack;

/**
 * Info: Leetcode#232 Implement Queue using Stacks
 * Ref: https://leetcode.com/problems/implement-queue-using-stacks
 */
public class Main {
    public static void main(String[] args) throws IOException {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }
}

class MyQueue {
    Stack<Integer> in;
    Stack<Integer> out;
    public MyQueue() {
        in = new Stack<>();
        out = new Stack<>();
    }

    public void push(int x) {
        in.push(x);
    }

    public int pop() {
        if (out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while(!in.isEmpty()) {
                out.push(in.pop());
            }
        }

        return out.peek();
    }

    public boolean empty() {
        if (in.isEmpty() && out.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}