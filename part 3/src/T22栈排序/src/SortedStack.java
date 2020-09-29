package T22栈排序.src; /**
 * https://leetcode-cn.com/problems/sort-of-stacks-lcci/
 */

import java.util.Stack;

class SortedStack {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public SortedStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int val) {
//        if (stack1.isEmpty()){
//            stack1.push(val);
//        }else {
//            if (val < stack1.peek()){
//                stack1.push(val);
//            }else {
//                while (!stack1.isEmpty()){
//                    stack2.push(stack1.pop());
//                    if (!stack1.isEmpty() && stack1.peek() >= val){
//                        break;
//                    }
//                }
//                stack1.push(val);
//                while (!stack2.isEmpty()){
//                    stack1.push(stack2.pop());
//                }
//            }
//        }

        if (!stack1.isEmpty()){
            if (val < stack1.peek()){
                if (!stack2.isEmpty()){
                    while (val < stack2.peek()){
                        stack1.push(stack2.pop());
                        if (stack2.isEmpty()){
                            break;
                        }
                    }
                }
                stack1.push(val);
            }else {
                while (val > stack1.peek()){
                    stack2.push(stack1.pop());
                    if (stack1.isEmpty()){
                        break;
                    }
                }
                stack1.push(val);
            }
        }else {
            if (!stack2.isEmpty()){
                while (val < stack2.peek()){
                    stack1.push(stack2.pop());
                    if (stack2.isEmpty()){
                        break;
                    }
                }
            }
            stack1.push(val);
        }
    }
    
    public void pop() {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        if (!stack1.isEmpty()){
            stack1.pop();
        }
    }
    
    public int peek() {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        if (stack1.isEmpty()){
            return -1;
        }else {
            return stack1.peek();
        }
    }
    
    public boolean isEmpty() {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return stack1.isEmpty();
    }
}

/**
 * Your SortedStack object will be instantiated and called as such:
 * SortedStack obj = new SortedStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.isEmpty();
 */