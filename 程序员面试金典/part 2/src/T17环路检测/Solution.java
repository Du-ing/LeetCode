package T17环路检测;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode p = head;
        set.add(p);
        while (p != null){
            p = p.next;
            if (!set.add(p)){
                return p;
            }
        }
        return null;
    }
}