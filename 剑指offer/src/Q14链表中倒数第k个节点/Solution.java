package Q14链表中倒数第k个节点;

/**
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode front = head;
        ListNode behind = head;
        
        int f = 0;
        while(front.next != null){
            front = front.next;
            f++;
            if(f >= k){
                behind = behind.next;
            }
        }
        return behind;
    }
}