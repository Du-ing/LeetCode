package T44幂集;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/power-set-lcci/
 */

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        res.add(list);
        int n = nums.length;
        for(int i=0;i<n;i++){
            dfs(nums,i,n,list,res);
        }
        return res;
    }

    private void dfs(int[] nums,int k,int n,List<Integer> list,List<List<Integer>> res){
        list.add(nums[k]);
        List<Integer> newList = new ArrayList<>(list);
        res.add(newList);
        for(int i=k+1;i<n;i++){
            dfs(nums,i,n,list,res);
        }
        //回溯
        if(list.size()>0)    list.remove(list.size()-1);
    }
}