package Scaler.Assignment3032023;

public class EqualMatrix {
    public static void main(String[] args) {
        int [][]A={{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        int [][]B={{1, 2, 3},{7, 8, 9},{4, 5, 6}};
        int isEqual=checkEqual(A,B);
        System.out.println(isEqual);
    }

    private static int checkEqual(int[][] A, int[][] B) {
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                if(A[i][j]!=B[i][j])
                    return 0;
            }
        }
        return 1;
    }
}
