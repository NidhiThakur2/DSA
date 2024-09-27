package Scaler.DSA4.Graphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
class Pair{
    int row;
    int col;
    Pair(int row,int col){
        row=this.row;
        col=this.col;
    }
}

public class RottenOranges {
    public static void main(String[] args) {
        int[][] A = new int[][]{{2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}};
        int[] arr1 = {-1,1,0,0};
        int[] arr2 = {0,0,1,-1};
        int n = A.length, m = A[0].length;
        int[][] dis = new int[n][m];
        for(int[] arr: dis) Arrays.fill(arr,Integer.MAX_VALUE);
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(A[i][j]==2) {
                    queue.add(new Pair(i,j));
                    dis[i][j]=0;
                }
            }
        }
        while(!queue.isEmpty()) {
            Pair pair = queue.poll();
            for(int i=0; i<4; i++) {
                int xx = pair.row + arr1[i];
                int yy = pair.col + arr2[i];
                if(xx>=0 && xx<n && yy>=0 && yy<m && A[xx][yy]==1) {
                    queue.add(new Pair(xx,yy));
                    A[xx][yy] = 2;
                    dis[xx][yy] = 0;
                    dis[xx][yy] = 1+dis[pair.row][pair.col];
                }
            }
        }
        int ans = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(A[i][j]!=0) ans = Math.max(ans, dis[i][j]);
            }
        }
        if(ans==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(ans);
    }
}
