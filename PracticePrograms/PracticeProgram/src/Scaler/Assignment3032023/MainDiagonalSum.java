package Scaler.Assignment3032023;

public class MainDiagonalSum {
    public static void main(String[] args) {
        //int [][]A={{1,-2,-3},{-4,5,-6},{-7,-8,9}};
        int [][]A={{3,2},{2,3}};
        int sum=0;
        for(int i=0;i<A.length;i++){
            sum+=A[i][i];
        }
        System.out.println(sum);
    }
}
