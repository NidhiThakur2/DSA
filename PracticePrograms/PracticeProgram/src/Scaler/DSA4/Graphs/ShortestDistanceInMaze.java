package Scaler.DSA4.Graphs;

import java.util.LinkedList;
import java.util.Queue;

class Point{
    int row;
    int col;
    int steps;
    Point(int row,int col,int steps){
        this.row=row;
        this.col=col;
        this.steps=steps;
    }
}

public class ShortestDistanceInMaze {
    public static void main(String[] args) {
        int A[][]=new int[][]{{0, 1},
                {1, 0}};
        int []B=new int[]{0,0};
        int []C=new int[]{1,1};
        int[] row=new int[]{-1,0,1,0};
        int[] col=new int[]{0,1,0,-1};
        boolean visited[][]=new boolean[A.length][A[0].length];
        Queue<Point> q=new LinkedList<>();
        q.add(new Point(B[0],B[1],0));
        while(!q.isEmpty()){
            Point currPoint=q.poll();
            int currRow=currPoint.row;
            int currCol=currPoint.col;
            //int steps=currPoint.steps;
            if(currRow==C[0] && currCol==C[1]) {
                System.out.println(currPoint.steps);
                break;
            }

            for(int k=0;k<4;k++) {
                int nRow=currRow;
                int nCol=currCol;
                int step = currPoint.steps;

                while (nRow >= 0 && nRow < A.length && nCol >= 0 && nCol < A[0].length &&
                        A[nRow][nCol] == 0){
                    nRow=nRow+row[k];
                    nCol=nCol+col[k];
                    step++;

                }
                nRow=nRow-row[k];
                nCol=nCol-col[k];
                step--;
                if(!visited[nRow][nCol]) {
                    q.add(new Point(nRow,nCol,step));
                    visited[nRow][nCol] = true;
                }
            }

        }
        System.out.println(-1);
    }
}
