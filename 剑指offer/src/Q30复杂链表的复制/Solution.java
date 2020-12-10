package Q30复杂链表的复制;

/**
 * https://leetcode-cn.com/problems/fu-za-lian-biao-de-fu-zhi-lcof/
 */

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        //1. 复制各节点，并构建拼接链表
        Node cur = head;
        while(cur != null){
            Node t = new Node(cur.val);
            t.next = cur.next;
            cur.next = t;
            cur = t.next;
        }
        //2. 构建各新节点的 random 指向
        cur = head;
        while(cur != null){
            if(cur.random != null){
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }
        //3. 拆分两链表
        cur = head.next;
        Node res = head.next;
        Node pre = head;
        while(cur.next != null){ //注意在此时结束
            pre.next = pre.next.next;
            cur.next = cur.next.next;
            pre = pre.next;
            cur = cur.next;
        }
        pre.next = null; //处理原链表尾节点
        return res;
    }
}