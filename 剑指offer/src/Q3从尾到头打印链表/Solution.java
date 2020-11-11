package Q3从尾到头打印链表;

/**
 *https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while(node != null){
            list.add(node.val);
            node = node.next;
        }
        int[] res = new int[list.size()];
        int k = 0;
        for(int i=list.size()-1; i>=0; i--){
            res[k] = list.get(i);
            k++;
        }
        return res;
    }
}