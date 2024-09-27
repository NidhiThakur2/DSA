package Scaler.DSA4;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapQueries {
    public static void main(String[] args) {
        int [][]A=new int[][]{{2, 5}, {2, 3}, {2, 1}, {1, -1}, {1, -1}};
        PriorityQueue<Integer> mh=new PriorityQueue<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int []result;
        for(int i=0;i<A.length;i++){
            int P=A[i][0];
            int Q=A[i][1];
            if(P==1 && Q==-1) {
                if(mh.size()==0)
                    ans.add(-1);
                else
                    ans.add(mh.remove());
            }
            if(P==2 && Q>0){
                mh.add(Q);
            }
        }
       // result=ans.stream().mapToInt(i->(int)i).toArray();
        ans.stream().forEach(System.out::println);

    }
}
