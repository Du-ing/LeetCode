package T45递归乘法;

/**
 * https://leetcode-cn.com/problems/recursive-mulitply-lcci/
 */

class Solution {
    public int multiply(int A, int B) {
        if(B == 1)  return A;
        return A + multiply(A,B-1);
    }
}