package Scaler.Assignment3032023;

public class AntiDiagonals {
    public static void main(String[] args) {
        //int [][]A={{1,2,3},{4,5,6},{7,8,9}};
        int [][]A={{1,2},{3,4}};
        int rows=(2*A.length)-1;
        int cols=A[0].length;
        int antiDiagonals[][]=new int [rows][cols];
        int c=0,d=0;
        for(int col=0;col<A.length;col++){
                int i=0;
                int j=col;
                d=0;
                while(i<A.length && j>=0){
                    antiDiagonals[c][d]=A[i][j];
                    d++;
                    i++;
                    j--;
                }
                c++;
        }
        c--;
        for(int row=0;row<A.length;row++){
            int i=row;
            int j=A.length-1;
            d=0;
            while(i<A.length && j>=0){
                antiDiagonals[c][d]=A[i][j];
                d++;
                i++;
                j--;
            }
            c++;
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(antiDiagonals[i][j]);
            }
            System.out.println();
        }

    }
}
