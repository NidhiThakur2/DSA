package Scaler.Assignment3032023;

public class MinorDiagonalSum {
    public static void main(String[] args) {
        int [][]A={{1,-2,-3},{-4,5,-6},{-7,-8,9}};
        //int [][]A={{3,2},{2,3}};
        int sum=0;
        for(int i=0,j=A.length-1;i<A.length;i++,j--){
            sum+=A[i][j];
        }
        System.out.println(sum);
    }
}
