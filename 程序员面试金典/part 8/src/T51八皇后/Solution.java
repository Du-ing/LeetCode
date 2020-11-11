package T51八皇后;

/**
 * https://leetcode-cn.com/problems/eight-queens-lcci/
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        Set<Integer> cols = new HashSet<>();//判断列
        Set<Integer> lines1 = new HashSet<>();//判断对角线1
        Set<Integer> lines2 = new HashSet<>();//判断对角线2
        List<Integer> site = new ArrayList<>();//路径
        List<List<String>> res = new ArrayList<>();//最终结果
        find(0,n,cols,lines1,lines2,site,res);
        return res;
    }

    private void find(int row,int n,Set<Integer> cols,Set<Integer> lines1,Set<Integer> lines2,List<Integer> site,List<List<String>> res){
        if(row == n){
            List<String> arr = new ArrayList<>();
            for(int i=0;i<site.size();i++){
                StringBuffer str = new StringBuffer();
                int k = site.get(i);
                for(int f=0;f<n;f++){
                    if(f == k) str.append("Q");
                    else str.append(".");
                }
                arr.add(str.toString());
            }
            res.add(arr);
            return;
        }
        for(int j=0;j<n;j++){
            if(cols.add(j)){
                if(lines1.add(j-row)){
                    if(lines2.add(j+row)){
                        site.add(j);
                        //System.out.println(row+":"+j);
                        find(row+1,n,cols,lines1,lines2,site,res);
                        site.remove(site.size()-1);
                        lines2.remove(j+row);
                    }
                    lines1.remove(j-row);
                }
                cols.remove(j);
            }
        }

//        for(int j=0;j<n;j++){
//            if(cols.contains(j))    continue;
//            if(lines1.contains(j-row))    continue;
//            if(lines2.contains(j+row))    continue;
//
//            cols.add(j);
//            lines1.add(j-row);
//            lines2.add(j+row);
//            site.add(j);
//            System.out.println(row+":"+j);
//            find(row+1,n,cols,lines1,lines2,site,res);
//            cols.remove(j);
//            lines1.remove(j-row);
//            lines2.remove(j+row);
//            site.remove(site.size()-1);
//        }
    }
}