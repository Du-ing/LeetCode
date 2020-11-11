package T66最小差;

/**
 * https://leetcode-cn.com/problems/smallest-difference-lcci/
 */

import java.util.Arrays;

class Solution {
    public int smallestDifference(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        long min = Math.abs((long)(a[0]-b[0]));
        int j = 0;
        for(int i=0; i<a.length; i++){
            while(true){
                if(j == b.length){
                    long t = Math.abs((long)(a[i]-b[j-1]));
                    min = t < min ? t : min;
                    break;
                }
                if(b[j] <= a[i]){
                    j++;
                }else{
                    long t = j > 0 ? Math.min((long)(a[i]-b[j-1]), (long)(b[j]-a[i])) : Math.abs((long)(b[j]-a[i]));
                    min = t < min ? t : min;
                    break;
                }
            }
        }
        return (int)min;
    }
}