package Q49滑动窗口最大值;


import java.util.LinkedList;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
//        int len = nums.length;
//        int[] res = new int[len - k + 1];
//        LinkedList<Integer> queue = new LinkedList<>();
//        int max = nums[0];
//        for(int i = 1; i < k; i++){
//            if(nums[i] > max){
//                max = nums[i];
//            }
//        }
//        for(int i = 0; i < k; i++){
//            if(nums[i] == max){
//                queue.offer(nums[i]);
//            }
//        }
//
//        res[0] = max;
//        int f = 1;
//
//        for(int t = k; t < len; t++){
//            int a = nums[t];
//            int b = nums[f - 1];
//
//            if(b == queue.peek()){
//                queue.poll();
//                if(queue.isEmpty()){
//                    int m = nums[f];
//                    for(int i = 1; i < k; i++){
//                        if(nums[f + i] > m){
//                            m = nums[f + i];
//                        }
//                    }
//                    for(int i = 0; i < k; i++){
//                        if(nums[f + i] == m){
//                            queue.offer(nums[f + i]);
//                        }
//                    }
//                }
//            }
//            max = queue.peek();
//
//            if(a > max){
//                res[f++] = a;
//                while(!queue.isEmpty()){
//                    queue.poll();
//                }
//                max = a;
//                queue.offer(max);
//            }else{
//                res[f++] = max;
//            }
//        }
//
//        return res;

        int len = nums.length;
        int[] res = new int[len - k + 1];

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> {return b - a;});
        for(int i = 0; i < k; i++){
            heap.offer(nums[i]);
        }
        res[0] = heap.peek();

        int f = 1;
        for(int i = k; i < len; i++){
            heap.remove(nums[f - 1]);
            heap.offer(nums[i]);
            res[f++] = heap.peek();
        }

        return res;
    }
}