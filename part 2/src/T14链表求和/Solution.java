package T14链表求和;

/**
 * https://leetcode-cn.com/problems/sum-lists-lcci/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        int flag = 0;
        while(true){
            ListNode s  = null;
            if (l1 == null && l2 != null){
                s = new ListNode((l2.val + flag) % 10);
                flag = (l2.val + flag) / 10;
                l2 = l2.next;
            }else if (l1 != null && l2 == null){
                s = new ListNode((l1.val + flag) % 10);
                flag = (l1.val + flag) / 10;
                l1 = l1.next;
            }else if (l1 != null && l2 != null){
                s = new ListNode((l1.val + l2.val + flag) % 10);
                flag = (l1.val + l2.val + flag) / 10;
                l1 = l1.next;
                l2 = l2.next;
            }else {
                if (flag == 1){
                    s = new ListNode((flag));
                    p.next = s;
                }
                break;
            }
            p.next = s;
            p = p.next;
        }
        return res.next;
    }
}