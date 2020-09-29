package T11返回倒数第k个节点;

/**
 * https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int kthToLast(ListNode head, int k) {
        //统计节点数法
//        ListNode p = head;
//        int num = 1;
//        while (p.next != null){
//            p = p.next;
//            num++;
//        }
//        int flag = num - k;
//        ListNode q = head;
//        for (int i = 0; i < flag; i++) {
//            q = q.next;
//        }
//        return q.val;

        //双指针法，快慢指针
        if (head.next == null){
            return head.val;
        }
        ListNode front = head;
        ListNode behind = head;
        for (int i = 0;; i++) {
            front = front.next;
            if (i >= k-1){
                behind = behind.next;
            }
            if (front.next == null){
                return behind.val;
            }
        }
    }
}