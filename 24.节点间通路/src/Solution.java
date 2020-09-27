/**
 * https://leetcode-cn.com/problems/route-between-nodes-lcci/
 */

import java.util.*;

class Solution {

    public boolean findWhetherExistsPath(int n, int[][] graph, int start, int target) {
        // 转化为邻接表
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < graph.length; i++) {
            if (adj[graph[i][0]] == null){
                adj[graph[i][0]] = new ArrayList<>();
            }
            adj[graph[i][0]].add(graph[i][1]);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        boolean[] flag = new boolean[n];
        queue.offer(start);
        flag[start] = true;

        while (!queue.isEmpty()){
            int temp = queue.poll();
            if (adj[temp] == null){
                continue;
            }
            for (Integer next : adj[temp]) {
                if (next == target){
                    return true;
                }else if (flag[next]){
                    continue;
                }else {
                    queue.offer(next);
                    flag[next] = true;
                }
            }
        }
        return false;
    }
}