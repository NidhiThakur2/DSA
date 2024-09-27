package Scaler.Assignment3032023;

public class AddMatrix {
    public static void main(String[] args) {
        int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][]B={{1, 2, 3},{7, 8, 9},{4, 5, 6}};
        int result[][]=new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
               result[i][j]=A[i][j]+B[i][j];
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
