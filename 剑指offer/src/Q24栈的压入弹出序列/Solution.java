package Q24栈的压入弹出序列;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int k = 0;
//        for(int i = 0; i < len; i++){
//            while((stack.isEmpty() || !stack.peek().equals(popped[i])) && k < len){
//                stack.push(pushed[k++]);
//            }
//            if(stack.peek().equals(popped[i])){
//                stack.pop();
//            }
//        }
        for(int i = 0; i < len; i++){
            stack.push(pushed[i]);
            while(!stack.isEmpty() && stack.peek().equals(popped[k])){
                stack.pop();
                k++;
            }
        }
        return stack.isEmpty();
    }
}