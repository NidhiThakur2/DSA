package Scaler.Assignment30062023;

public class RowWiseColumnWiseSearch {
    public static void main(String[] args) {
        int[][] A = new int[][]{{2, 8, 8}, {2, 8, 8}, {2, 8, 8}};
        int B = 8;
        int row=0,col=A[0].length-1;
        int min=Integer.MAX_VALUE;
        while(row<A.length && col>=0){
            if(A[row][col]==B) {
                int ans=(row + 1) * 1009 + col+1;
                if(min>ans) {
                    min=ans;
                }
                col--;
            }
            else {
                if(B<A[row][col])
                    col--;
                else
                    row++;
            }
        }
        if(min!=Integer.MAX_VALUE)
            System.out.println(min);
        else
            System.out.println(-1);

    }
}

