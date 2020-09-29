import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null){
            return head;
        }
        Set<Integer> set = new HashSet<Integer>();
        set.add(head.val);
        ListNode p = head;
        while (p.next != null){
            ListNode q = p.next;
            if (!set.add(q.val)) {
                p.next = p.next.next;
            }else {
                p = p.next;
            }
        }
        return head;
    }
}