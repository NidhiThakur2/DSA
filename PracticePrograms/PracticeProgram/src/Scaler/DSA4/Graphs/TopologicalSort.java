package Scaler.DSA4.Graphs;

import java.util.*;

public class TopologicalSort {
    public static void main(String[] args) {
        int [][]B=new int[][]{ {1,4},{1,2},{4,2},{4,3},{3,2},{5,2},{3,5},{8,2},{8,6}};
        int A=8;
        ArrayList<Integer>[] graph=new ArrayList[A+1];
        boolean[] visited=new boolean[A+1];
        int[] indegree=new int[A+1];
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=1;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<B.length;i++){
            int node1=B[i][0];
            int node2=B[i][1];
            graph[node1].add(node2);
            indegree[node2]++;
        }
        for(int i=1;i< indegree.length;i++){
            if(indegree[i]==0 ) {
                q.add(i);
            }
        }
        ArrayList<Integer>ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            visited[node]=true;
            ans.add(node);
            ArrayList<Integer> al=graph[node];
            for (int n: al) {
                if(!visited[n])
                    indegree[n]--;
                if(indegree[n]==0) {
                    q.add(n);
                }
            }
        }
       // ans.stream().forEach(System.out::println);
        int []a=ans.stream().mapToInt(Integer::intValue).toArray();
        Arrays.stream(a).forEach(System.out::println);
    }
}
