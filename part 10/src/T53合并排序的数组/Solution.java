import java.util.LinkedList;

class Solution {
    public void merge(int[] A, int m, int[] B, int n) {
        if(n == 0) return;
        LinkedList<Integer> queue = new LinkedList<>();
        int k = 0;
        for(int i=0; i<m+n; i++){
            if(i < m){
                if(B[k] >= A[i]){
                    queue.offer(A[i]);
                }else{
                    queue.offer(B[k]);
                    k++;
                    i--;
                }
            }else{
                if(k < n){
                    queue.offer(B[k]);
                    k++;
                }
            }
        }
        for(int j=0;; j++){
            A[j] = queue.poll();
            if(queue.isEmpty()) break;
        }
    }
}