package Scaler.Assignment6032023;

public class SpiralOrder {
    public static void main(String[] args) {
        int length=5,n=length;
        int row=0,col=0;
        int num=1;
        int [][]A=new int[length][length];
        while(n>1){
            for(int i=1;i<=n-1;i++){
                A[row][col]=num;
                col++;
                num++;
            }
            for(int i=1;i<=n-1;i++){
                A[row][col]=num;
                row++;
                num++;
            }
            for(int i=1;i<=n-1;i++){
                A[row][col]=num;
                col--;
                num++;
            }
            for(int i=1;i<=n-1;i++){
                A[row][col]=num;
                row--;
                num++;
            }
            row++;
            col++;
           n=n-2;
        }
        if(n==1){
            A[row][col]=num;
        }
        for(int i=0;i<=length-1;i++){
            for(int j=0;j<=length-1;j++){
                System.out.print(A[i][j]+"     ");
            }
            System.out.println();
        }

    }
}
