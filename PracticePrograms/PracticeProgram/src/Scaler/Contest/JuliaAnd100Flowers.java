package Scaler.Contest;

import java.util.ArrayList;

public class JuliaAnd100Flowers {
    public static void main(String[] args) {
        int []A={100,11,21,1};
        int B[][]={{2,4},{1,3}};
        ArrayList<Integer>pf=new ArrayList<>();
        int sum=0;
        for(int i=0;i<A.length;i++){
            if(A[i]<100)
                sum=sum+1;
            else
                sum=sum+0;
            pf.add(i,sum);
        }
        ArrayList<Integer>result=new ArrayList<>();
        result=findCount(pf,B);
        result.stream().forEach(System.out::println);
    }

    private static ArrayList<Integer> findCount(ArrayList<Integer> A, int[][] B) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<B.length;i++){
            int l=B[i][0]-1;
            int r=B[i][1]-1;
            int count;
            if(l==0)
                count=A.get(r);
            else
                count=A.get(r)-A.get(l-1);
            result.add(count);
        }
        return result;
    }
}
