package Scaler.DSA4.Graphs;

import PracticePrograms.A;

import java.util.ArrayList;
import java.util.Arrays;

public class PathInDirectedGraph {
    public static void main(String[] args) {
      /*  int [][]B=new int[][]{{1, 2},
                {2, 3},
                {3, 4},
                {4, 5}};*/
       int [][]B=new int[][]{{1, 2},
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
       };
        int A=5;
        ArrayList<Integer> [] graph=new ArrayList[A+1];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<B.length;i++){
            int node1=B[i][0];
            int node2=B[i][1];
            ArrayList<Integer> al=graph[node1];
            al.add(node2);
            graph[node1]=al;
        }
        boolean[] visited=new boolean[A+1];
        for(int i=0;i<=A;i++)
            visited[i]=false;
        checkPath(graph,visited,1);
        int ans=0;
        if(visited[A])
            ans=1;
     }

    private static void checkPath(ArrayList<Integer>[] graph, boolean[] visited, int i) {
        visited[i]=true;
        ArrayList<Integer> al=graph[i];
        for(Integer num:al){
            if(!visited[num])
                checkPath(graph,visited,num);
        }
    }

}
