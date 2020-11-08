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
        int i = 0;
        int j = 0;
        while(i < birth.length){
            int year = birth[i];
            int n1 = 0;
            while(i < birth.length){
                if(birth[i] > year) break;
                i++;
                n1++;
            }
            int n2 = 0;
            while(j < death.length){
                if(death[j] >= year) break;
                j++;
                n2++;
            }
            sum = sum + n1 - n2;
            if(sum > max){
                max = sum;
                res = year;
            }
        }
        return res;
    }
}