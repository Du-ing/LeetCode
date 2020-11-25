package Q16合并两个排序的链表;

/**
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 */

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = res;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                p.next = l1;
                l1 = l1.next;
                p = p.next;
            }else{
                p.next = l2;
                l2 = l2.next;
                p = p.next;
            }
        }   
        ListNode left = l1 != null ? l1 : l2;
        p.next = left;
        return res.next;
    }
}