package Scaler.Assignment3032023;

public class SCalerMultiplication {
    public static void main(String[] args) {
        int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int B=2;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                A[i][j]*=2;
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }


}
