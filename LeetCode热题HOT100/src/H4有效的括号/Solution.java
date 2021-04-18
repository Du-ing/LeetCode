package H4有效的括号;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/
 * 栈操作
 */

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }
            else if(stack.size() == 0){
                return false;
            }
            else if(c == ')'){
                if(stack.pop() != '('){
                    return false;
                }
            }
            else if(c == ']'){
                if(stack.pop() != '['){
                    return false;
                }
            }
            else if(c == '}'){
                if(stack.pop() != '{'){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}