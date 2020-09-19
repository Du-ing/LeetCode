/**
 * https://leetcode-cn.com/problems/partition-list-lcci/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null){
            return head;
        }
        ListNode front = head;
        ListNode behind = head;
        while (front.next != null){
            front = front.next;
            if (behind.val < x){
                behind = behind.next;
            }
            if (front.val < x){
                int t = front.val;
                front.val = behind.val;
                behind.val = t;
            }
        }
        return head;
    }
}