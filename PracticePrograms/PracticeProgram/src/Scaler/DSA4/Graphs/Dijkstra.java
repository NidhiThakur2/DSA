package Scaler.DSA4.Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Dijkstra {
    static class   Pair{
        int v;
        int w;

        public Pair(int v, int w) {
            this.v = v;
            this.w = w;
        }
    }
    public static void main(String[] args) {
        int A=5;
        int B[][]=new int[][]{{1,4,4},{0,3,3},{1,2,3},{0,4,2},{0,1,8},{0,2,7},{2,3,4},{1,3,7},{3,4,2},{2,4,2}};
        int C=3;
        ArrayList<Pair>[] graph=new ArrayList[A];

        for(int i=0;i<A;i++)
            graph[i]=new ArrayList<>();


        for(int i=0;i<B.length;i++){
            int u=B[i][0];
            int v=B[i][1];
            int w=B[i][2];
            Pair p=new Pair(v,w);
            Pair p1=new Pair(u,w);
            graph[u].add(p);
            graph[v].add(p1);
        }
        int distance[]=dijkstra(graph,A,C);
        Arrays.stream(distance).forEach(System.out::println);

    }

    private static int[] dijkstra(ArrayList<Pair>[] graph, int A, int C) {
        boolean visited[]=new boolean[A];
        int[]distance=new int[A];

        for(int i=0;i<distance.length;i++){
            if(i!=C)
                distance[i]=Integer.MAX_VALUE;

        }
        visited[C]=true;
        PriorityQueue<Pair> mh=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.w==o2.w){
                    return o1.v-o2.v;
                }
                return Integer.compare(o1.w,o2.w);
            }
        });
        for (Pair p:graph[C]) {
            mh.add(p);
        }
        //mh.add(new Pair(C,0));
        while(!mh.isEmpty()){
            Pair p=mh.poll();
            int v=p.v;
            int w=p.w;
            if(visited[v])
                continue;
            visited[v]=true;
            distance[v]=w;
            ArrayList<Pair> al=graph[v];
            for (Pair child:al){
              /*  if(distance[v]==Integer.MAX_VALUE)
                    distance[v]=w;*/
                int currDist=distance[v]+child.w;

                if(currDist<=distance[child.v]){
                   distance[child.v]=currDist;
                   mh.add(new Pair(child.v,currDist));
                }
            }

        }
        return distance;
    }
}

