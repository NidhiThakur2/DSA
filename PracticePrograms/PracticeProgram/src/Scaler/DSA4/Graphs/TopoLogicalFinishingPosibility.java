package Scaler.DSA4.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoLogicalFinishingPosibility {
    public static void main(String[] args) {
        int A=3;
        int []B=new int[]{1,2};
        int []C=new int[]{2,1};
        ArrayList[]graph=new ArrayList[A+1];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList();
        int []indegree=new int[A+1];
        for(int i=0;i<B.length;i++){
            int node1=B[i];
            int node2=C[i];
            graph[node1].add(node2);
            indegree[node2]++;
        }
        Queue<Integer> queue=new LinkedList<>();
        for(int i=1;i<indegree.length;i++)
            if(indegree[i]==0)
                queue.add(i);
        while(!queue.isEmpty()){
            int node=queue.poll();
            ArrayList<Integer> al=graph[node];
            for(Integer n:al){
                indegree[n]--;
                if(indegree[n]==0)
                    queue.add(n);
            }
        }
        int ans=1;
        for(int i=0;i<indegree.length;i++){
            if(indegree[i]!=0) {
                ans=0;
                break;
            }

        }
        System.out.println(ans);
    }
}
