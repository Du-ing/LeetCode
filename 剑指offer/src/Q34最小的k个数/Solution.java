package Q34最小的k个数;

/**
 * https://leetcode-cn.com/problems/zui-xiao-de-kge-shu-lcof/
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
//        Arrays.sort(arr);
//        int[] res = new int[k];
//        for(int i = 0; i < k; i++){
//            res[i] = arr[i];
//        }
//        return res;

        int[] res = new int[k];
        if(k == 0 || arr.length == 0){
            return res;
        }

        PriorityQueue<Integer> heap = new PriorityQueue<Integer>((o1,o2) -> o2.compareTo(o1));

        for(int i = 0; i < arr.length; i++){
            int x = arr[i];
            if(heap.size() < k){
                heap.offer(x);
            }else if(heap.size() == k && x < heap.peek()){
                heap.offer(x);
                heap.poll();
            }
        }

        int i = 0;
        for(int integer : heap){
            res[i++] = integer;
        }
        return res;
    }
}