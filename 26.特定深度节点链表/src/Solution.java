/**
 * https://leetcode-cn.com/problems/list-of-depth-lcci/solution/
 */

import java.util.LinkedList;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        ListNode[] lists = new ListNode[100];

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(tree);

        int[] num = new int[100];
        num[0] = 1;

        int deep = 0;

        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            lists[deep] = new ListNode(node.val);
            ListNode q = lists[deep];
            if (node.left != null){
                queue.offer(node.left);
                num[deep+1]++;
            }
            if (node.right != null){
                queue.offer(node.right);
                num[deep+1]++;
            }

            for (int i = 1; i < num[deep]; i++) {
                node = queue.poll();
                ListNode list = new ListNode(node.val);
                q.next = list;
                q = q.next;
                if (node.left != null){
                    queue.offer(node.left);
                    num[deep+1]++;
                }
                if (node.right != null){
                    queue.offer(node.right);
                    num[deep+1]++;
                }
            }
            deep++;
        }
        int i = 0;
        for (; i < lists.length; i++) {
            if (lists[i] == null){
                break;
            }
        }
        ListNode[] res = new ListNode[i];
        for (int i1 = 0; i1 < i; i1++) {
            res[i1] = lists[i1];
        }
        return res;
    }
}