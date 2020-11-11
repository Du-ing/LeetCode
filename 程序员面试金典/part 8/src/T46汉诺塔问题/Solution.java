package T46汉诺塔问题;

/**
 * https://leetcode-cn.com/problems/hanota-lcci/
 */

import java.util.List;

class Solution {
    public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
        int n = A.size();
        move(n,A,B,C);
    }

    private void move(int n,List<Integer> A, List<Integer> B, List<Integer> C){
        if (n == 1){
            //A上只有一个盘子，直接将这个盘子移到C上
            C.add(A.remove(A.size()-1));
        } else {
            //A上不止一个盘子
            //先将A上n-1个盘子移到B上
            move(n-1,A,C,B);
            //再将A剩下的一个盘子移到C上
            C.add(A.remove(A.size()-1));
            //再将B上n-1个盘子移到C上
            move(n-1,B,A,C);
        }
    }
}