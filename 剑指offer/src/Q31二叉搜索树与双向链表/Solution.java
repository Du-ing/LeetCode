package Q31二叉搜索树与双向链表;

/**
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-yu-shuang-xiang-lian-biao-lcof/
 */

import java.util.ArrayList;

class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};

class Solution {
    public Node treeToDoublyList(Node root) {
        if(root == null) return null;
        ArrayList<Node> list = new ArrayList<>();
        sort(list,root);
        Node head = list.get(0);
        int i = 0;
        while(true){
            Node node = list.get(i);
            if(i == list.size() - 1){
                node.right = head;
                head.left = node;
                break;
            }else{
                Node next = list.get(i + 1);
                node.right = next;
                next.left = node;
            }
            i++;
        }
        return head;
    }

    void sort(ArrayList<Node> list,Node node){
        if(node == null) return;
        sort(list,node.left);
        list.add(node);
        sort(list,node.right);
    }
}