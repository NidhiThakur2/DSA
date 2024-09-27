package Scaler.DSA4.Graphs;

import java.util.ArrayList;

public class CycleInDirectedGraph {
    public static void main(String[] args) {
        int [][]B= new int[][]{{1, 2},
                {4, 1},
                {2, 4},
                {3, 4},
                {5, 2},
                {1, 3}
        };
        /*int [][]B= new int[][]{{1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };*/
        int A=5;
        ArrayList<Integer>[] graph=new ArrayList[A+1];
        for(int i=0;i<graph.length;i++)
            graph[i]=new ArrayList<>();
        for(int i=0;i<B.length;i++){
            int node1=B[i][0];
            int node2=B[i][1];
            graph[node1].add(node2);
        }
       /*    for(int i=1;i<graph.length;i++){
            ArrayList<Integer> al=graph[i];
            for(Integer num: al){
                System.out.print(num+" ");
            }
            System.out.println();
        }*/

        int ans=0;
        for(int i=1;i<=A;i++) {
            boolean[] visited=new boolean[A+1];
            ans = checkCycle(graph, visited, i);
            if(ans==1)
                break;

        }
        System.out.println(ans);


      //  System.out.println(ans);
    }

    private static int checkCycle(ArrayList<Integer>[] graph, boolean[] visited, int start) {
        if(visited[start]==true)
            return 1;
        visited[start]=true;
        int flag=0;
        ArrayList<Integer> al=graph[start];
        for(Integer num:al){
            flag=checkCycle(graph,visited,num);
            if(flag==1)
                return 1;
            visited[num]=false;
        }
        return 0;

    }
}
