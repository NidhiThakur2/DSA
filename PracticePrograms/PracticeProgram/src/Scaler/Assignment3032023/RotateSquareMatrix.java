package Scaler.Assignment3032023;

public class RotateSquareMatrix {
    public static void main(String[] args) {
        //int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        //int [][]A={{1, 2},{3,4}};
        int [][]A={{1}};
        squareTranspose(A);
        reverseTranspose(A);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }

    private static void reverseTranspose(int[][] A) {
        for(int i=0;i<A.length;i++){
            int first=0,last=A.length-1;
            while(first<last){
                int temp=A[i][first];
                A[i][first]=A[i][last];
                A[i][last]=temp;
                first++;
                last--;
            }
        }
    }

    private static void squareTranspose(int[][] A) {
        for(int i=0;i<A.length;i++){
            for( int j=i+1;j<A[i].length;j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }
    }
}
