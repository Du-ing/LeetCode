/**
 * https://leetcode-cn.com/problems/min-stack-lcci/
 */
import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> minStack;
    private int num;

    public MinStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        num = 0;
    }

    public void push(int x) {
        stack.push(x);
        if (num > 0){
            int top = minStack.peek();
            if (x < top){
                minStack.push(x);
            }else {
                minStack.push(top);
            }
        }else {
            minStack.push(x);
        }
        num++;
    }

    public void pop() {
        int x = stack.pop();
        minStack.pop();
        num--;
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */