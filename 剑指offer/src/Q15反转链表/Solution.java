package Q15反转链表;

/**
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode reverseList(ListNode head) {
//        if(head == null) return null;
//        ListNode p = head;
//        ListNode res = new ListNode(p.val);
//        res.next = null;
//
//        while(p.next != null){
//            p = p.next;
//            ListNode q = new ListNode(p.val);
//            q.next = res;
//            res = q;
//        }
//        return res;

        ListNode front = head;
        ListNode behind = null;

        while(front != null){
            ListNode t = front.next;
            front.next = behind;
            behind = front;
            front = t;
        }
        return behind;
    }
}