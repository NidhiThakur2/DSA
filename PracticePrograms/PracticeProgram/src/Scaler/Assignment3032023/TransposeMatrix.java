package Scaler.Assignment3032023;

public class TransposeMatrix {
    public static void main(String[] args) {
       // int [][]A={{1, 2},{1, 2},{1, 2}};
        int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int rows=A.length;
        int cols=A[0].length;
        int transposeA[][]= new int [cols][rows];
        if(rows==cols)
            transposeA=squareTranspose(A);
        else
            rectangleTranspose(A,transposeA);

        for(int i=0;i<transposeA.length;i++){
            for(int j=0;j<transposeA[i].length;j++){
                System.out.print(transposeA[i][j]);
            }
            System.out.println();
        }
    }

    private static void rectangleTranspose(int[][] A, int[][] transposeA) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                transposeA[j][i]=A[i][j];
            }
        }

    }

    private static int[][] squareTranspose(int[][] A) {
        for(int i=0;i<A.length;i++){
            for( int j=i+1;j<A[i].length;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
        return A;
    }
}
