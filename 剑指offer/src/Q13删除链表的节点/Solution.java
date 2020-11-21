package Q13删除链表的节点;

/**
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if(head.val == val){
            head = head.next;
        }
        else{
            ListNode front = head;
            ListNode behind = head.next;
            while(behind != null){
                if(behind.val == val){
                    front.next = behind.next;
                    break;
                }
                front = front.next;
                behind = behind.next;
            }
        }
        return head;
    }
}