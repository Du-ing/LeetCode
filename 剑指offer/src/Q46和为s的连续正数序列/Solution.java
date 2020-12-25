package Q46和为s的连续正数序列;

/**
 * https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof/
 */

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] findContinuousSequence(int target) {
        //暴力法
//        List<int[]> res = new ArrayList<>();
//
//        for(int i = 1; i < target; i++){
//            int sum = i;
//            for(int j = i + 1; j < target; j++){
//                sum += j;
//                if(sum == target){
//                    int[] temp = new int[j - i + 1];
//                    int a = 0;
//                    for(int k = i; k <= j; k++){
//                        temp[a++] = k;
//                    }
//                    res.add(temp);
//                }else if(sum > target){
//                    break;
//                }
//            }
//        }
//        return res.toArray(new int[res.size()][]);

        //双指针法（滑动窗口）
        List<int[]> res = new ArrayList<>();

        int a = 1;
        int b = 2;
        int sum = a + b;
        while(a <= (target + 1) / 2 && b <= (target + 1) / 2){
            if(sum == target){
                int[] temp = new int[b - a + 1];
                int k = 0;
                for(int i = a; i <= b; i++){
                    temp[k++] = i;
                }
                res.add(temp);
                sum -= a;
                a++;
            }else if(sum < target){
                b++;
                sum += b;
            }else{
                sum -= a;
                a++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}