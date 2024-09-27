package Scaler.DSA4;

import Scaler.Assignment15022023.PrimeCount;

import java.util.PriorityQueue;

public class MaxPriorityQueue {
    public static void main(String[] args) {
        int a[]=new int[]{2,4,3,2,3,2};
        PriorityQueue<Integer> maxPQ=new PriorityQueue<Integer>((x,y)->y-x);
        for(int i=0;i<a.length;i++){
            maxPQ.add(a[i]);

        }
        while(!maxPQ.isEmpty()){
            System.out.println(maxPQ.remove());
        }
    }
}
