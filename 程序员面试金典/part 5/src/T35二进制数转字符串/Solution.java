package T35二进制数转字符串;

/**
 * https://leetcode-cn.com/problems/bianry-number-to-string-lcci/
 */

class Solution {
    public String printBin(double num) {
        StringBuilder res = new StringBuilder();
        res.append("0.");
        for (int i = 1; i <= 30; i++) {
            if (Math.pow(2,-i) <= num){
                res.append(1);
                num -= Math.pow(2,-i);
                if (num == 0)   break;
            }else {
                res.append(0);
            }
        }
        if (num != 0)   return "ERROR";
        return res.toString();
    }
}