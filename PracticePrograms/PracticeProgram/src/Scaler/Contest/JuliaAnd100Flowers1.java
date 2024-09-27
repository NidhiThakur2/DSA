package Scaler.Contest;

import java.util.ArrayList;

public class JuliaAnd100Flowers1 {
    public static void main(String[] args) {
        int []A={100,11,21,1};
        int B[][]={{2,4},{1,3}};

        ArrayList<Integer>result=new ArrayList<>();
        result=findCount(A,B);
        result.stream().forEach(System.out::println);
    }

    private static ArrayList<Integer> findCount(int[] A, int[][] B) {
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<B.length;i++){
            int l=B[i][0];
            int r=B[i][1];
            int count=0;
            for(int j=l-1;j<=r-1;j++){
                if(A[j]<100) {
                    count++;

                }

            }
            result.add(count);
        }
        return result;
    }
}
