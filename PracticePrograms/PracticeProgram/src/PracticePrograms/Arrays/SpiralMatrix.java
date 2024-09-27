package PracticePrograms.Arrays;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {
        int [][]A=new int[][]{{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        int row=A.length;
        int col=A[0].length;
        ArrayList<Integer> result=new ArrayList<>();
        int up=0,left=0;
        int right=col-1;
        int down=row-1;
        while(result.size()<row*col){
            for(int c=left;c<=right;c++)
                result.add(A[up][c]);
            for(int r=up+1;r<=down;r++)
                result.add(A[r][right]);
            if(up!=down){
                for(int c=right-1;c>=left;c--)
                    result.add(A[down][c]);
            }
            if(left!=right){
                for(int r=down-1;r>up;r--)
                    result.add(A[r][left]);
            }
            up++;
            left++;
            right--;
            down--;
        }
        result.stream().forEach(System.out::println);
    }
}
