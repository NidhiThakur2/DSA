package Scaler.Assignment3032023;

import java.util.Arrays;

public class RowSum {
    public static void main(String[] args) {
        int [][]A={{1,2,3,4},{5,6,7,8},{9,2,3,4}};
        int []result=new int[A.length];
        for(int i=0;i<A.length;i++){
            int sum=0;
            for(int j=0;j<A[0].length;j++){
                sum+=A[i][j];
            }
            result[i]=sum;
        }
        Arrays.stream(result).forEach(System.out::println);
    }

}
