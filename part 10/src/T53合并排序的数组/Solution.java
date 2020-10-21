package T53合并排序的数组;

/**
 * https://leetcode-cn.com/problems/sorted-merge-lcci/
 */

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        if(n == 0) return;
        int f = 0;
        int[] flag = new int[m+n];

        int k = 0;
        for(int i=0; i<m+n; i++){
            if(i < m){
                if(k >= n || B[k] >= A[i]){
                    flag[f++] = A[i];
                }else{
                    flag[f++] = B[k++];
                    i--;//回退
                }
            }else{
                if(k < n){
                    flag[f++] = B[k++];
                }
            }
        }
        for(int j=0; j<m+n; j++){
            A[j] = flag[j];
        }
    }
}