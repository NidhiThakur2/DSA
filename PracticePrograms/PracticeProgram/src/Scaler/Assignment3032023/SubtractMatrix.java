package Scaler.Assignment3032023;

public class SubtractMatrix {
    public static void main(String[] args) {
       // int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        //int [][]B={{9, 8, 7},{6, 5, 4},{3, 2, 1}};
        int [][]A={{1, 1}};
        int [][]B={{2, 3}};
        int result[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                result[i][j]=A[i][j]-B[i][j];
            }
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
