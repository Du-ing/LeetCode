package T37下一个数;

/**
 * https://leetcode-cn.com/problems/closed-number-lcci/
 */

class Solution {
    public int[] findClosedNumbers(int num) {
        int[] res = new int[2];
        res[0] = res[1] = -1;
        int count = oneCount(num);
        int up = num + 1;
        int down = num - 1;
        while (up <= 2147483647){
            if (oneCount(up) == count){
                res[0] = up;
                break;
            }
            up++;
        }
        while (down >= 1){
            if (oneCount(down) == count){
                res[1] = down;
                break;
            }
            down--;
        }
        return res;
    }

    //记录1的个数
    private int oneCount(int n){
        int count = 0;
        while (n != 0){
            n &= n-1;
            count++;
        }
        return count;
    }
}