package T20堆盘子.src; /**
 * https://leetcode-cn.com/problems/stack-of-plates-lcci/
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class StackOfPlates {

    private List<Stack<Integer>>stacks;
    private int len;

    public StackOfPlates(int cap) {
        stacks = new ArrayList<>();
        len = cap;
    }
    
    public void push(int val) {
        if (len <= 0) {
            return;
        }
        if (stacks.isEmpty() || stacks.get(stacks.size()-1).size() == len){
            Stack<Integer> stack = new Stack<>();
            stack.push(val);
            stacks.add(stack);
        }else {
            stacks.get(stacks.size()-1).push(val);
        }
    }
    
    public int pop() {
        return popAt(stacks.size()-1);
    }
    
    public int popAt(int index) {
        if (index > stacks.size()-1 || index < 0){
            return -1;
        }
        int pop = stacks.get(index).pop();
        if (stacks.get(index).isEmpty()){
            stacks.remove(index);
        }
        return pop;
    }
}

/**
 * Your StackOfPlates object will be instantiated and called as such:
 * StackOfPlates obj = new StackOfPlates(cap);
 * obj.push(val);
 * int param_2 = obj.pop();
 * int param_3 = obj.popAt(index);
 */