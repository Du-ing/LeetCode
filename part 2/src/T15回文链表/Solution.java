package T15回文链表; /**
 * https://leetcode-cn.com/problems/palindrome-linked-list-lcci/
 */

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null){
            return true;
        }
        int len = 1;
        ListNode p = head;
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(p.val);
        while (p.next != null){
            p = p.next;
            stack.push(p.val);
            len++;
        }
        for (int i = 0; i < len / 2; i++) {
            if (head.val != stack.pop()){
                return false;
            }
            head = head.next;
        }
        return true;
    }
}