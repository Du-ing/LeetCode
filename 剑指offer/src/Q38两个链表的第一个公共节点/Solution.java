package Q38两个链表的第一个公共节点;

/**
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode nodeA = headA;
        ListNode nodeB = headB;
        //先遍历两个链表的长度
        while(nodeA != null){
            nodeA = nodeA.next;
            a++;
        }
        while(nodeB != null){
            nodeB = nodeB.next;
            b++;
        }

        ListNode quick = null;
        ListNode slow = null;
        int k = 0;
        //确定快慢指针
        if(a >= b){
            quick = headA;
            slow = headB;
            k = a - b;
        }else{
            quick = headB;
            slow = headA;
            k = b - a;
        }
        //快指针先跑
        for(int i = 0; i < k; i++){
            quick = quick.next;
        }
        //快慢指针一起跑，寻找公共节点
        while(quick != null){
            if(quick == slow){
                return quick;
            }
            quick = quick.next;
            slow = slow.next;
        }
        return null;
    }
}