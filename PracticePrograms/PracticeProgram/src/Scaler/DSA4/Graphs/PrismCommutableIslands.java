package Scaler.DSA4.Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
class Pairs{
    int v;
    int weight;

    public Pairs(int v, int weight) {
        this.v = v;
        this.weight=weight;
    }
}
public class PrismCommutableIslands {

    public static void main(String[] args) {
        int [][]B=new int [][]{{1, 2, 1},
                {2, 3, 2},
                {3, 4, 4},
                {1, 4, 3} };
        int A=4;
        PriorityQueue<Pairs> mh=new PriorityQueue<>(new Comparator<Pairs>() {
            @Override
            public int compare(Pairs o1, Pairs o2) {
                return Integer.compare(o1.weight,o2.weight);
            }
        });
        ArrayList<Pairs>[] graph=new ArrayList[A+1];
        for(int i=1;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<B.length;i++){
            int u=B[i][0];
            int v=B[i][1];
            int w=B[i][2];
            Pairs p=new Pairs(v,w);
            Pairs p1=new Pairs(u,w);
            graph[u].add(p);
            graph[v].add(p1);
        }
        boolean visited[]=new boolean[A+1];
        visited[1]=true;
        ArrayList<Pairs> firstNodeAl=graph[1];
        for(Pairs pair:firstNodeAl){
            mh.add(pair);
        }
        int cost=0;

        while(!mh.isEmpty()){
            Pairs pair=mh.poll();
            int v=pair.v;
            if(visited[v])
                continue;
            visited[v]=true;
            cost+=pair.weight;
            ArrayList<Pairs> al=graph[v];
            for (Pairs p:al) {
                if(!visited[p.v])
                    mh.add(p);
            }

        }
        System.out.println(cost);


    }
}
