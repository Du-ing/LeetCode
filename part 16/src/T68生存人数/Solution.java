package T68生存人数;

/**
 * https://leetcode-cn.com/problems/living-people-lcci/
 */

import java.util.Arrays;

class Solution {
    public int maxAliveYear(int[] birth, int[] death) {
        Arrays.sort(birth);
        Arrays.sort(death);
        int res = 0;
        int max = 0;
        int sum = 0;
        int j = 0;
        for(int i=0; i<birth.length-1;){
            int year = birth[i];
            int num1 = 1;
            while(true){
                if(i < birth.length-1) i++;
                if(birth[i] > year) break;
                num1++;
            }
            int num2 = 0;
            while(true){
                if(death[j] > year) break;
                num2++;
                j++;
            }
            sum = sum + num1 - num2;
            if(sum > max){
                max = sum;
                res = i;
            }
        }
        return birth[res];
    }
}