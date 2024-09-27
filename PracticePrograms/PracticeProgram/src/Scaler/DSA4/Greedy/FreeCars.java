package Scaler.DSA4.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

class Pair{
    int time;
    int profit;
    Pair(int time,int profit){
        this.time=time;
        this.profit=profit;
    }
    public String toString(){
        return "time:"+this.time+"profit:"+this.profit;
    }
}
public class FreeCars {
    public static void main(String[] args) {
        int[]A=new int[]{3, 8, 7, 5};
        int[]B=new int[]{3, 1, 7, 19};
        Pair[] pairs=new Pair[A.length];
        for(int i=0;i<A.length;i++){
            pairs[i]=new Pair(A[i],B[i]);
        }
        ArrayList<Pair> pairsList=(ArrayList<Pair>) Arrays.stream(pairs).sorted((pair1, pair2)->pair1.time-pair2.time).collect(Collectors.toList());
        PriorityQueue<Pair> mhPair=new PriorityQueue<Pair>((x,y)->x.profit-y.profit);
        int t=0;
        for(int i=0;i< pairsList.size();i++){
            if(t<pairsList.get(i).time){
                mhPair.add(pairsList.get(i));
                t++;
            }else {
                if(pairsList.get(i).profit>mhPair.peek().profit){
                    mhPair.remove();
                    mhPair.add(pairsList.get(i));
                }
            }
        }
        long sum=0;
        while(!mhPair.isEmpty()){
            sum=sum+mhPair.poll().profit;
        }
        System.out.println((int)sum%1000000007);
    }
}
