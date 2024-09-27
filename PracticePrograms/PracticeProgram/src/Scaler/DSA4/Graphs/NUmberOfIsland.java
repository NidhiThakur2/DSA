package Scaler.DSA4.Graphs;

public class NUmberOfIsland {
    public static void main(String[] args) {
        int [][]A=new int[][]{
                {0,0,1,0,1,0,1,0,1},{0,1,0,0,0,1,0,1,0},{1,1,0,1,0,1,1,0,1},{1,0,0,0,1,1,0,1,0},{0,0,1,0,1,1,1,1,0},{1,1,0,1,1,0,1,0,0},{0,0,1,1,0,1,0,0,0}};
        /*int [][]A=new int[][]{
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 0},

                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };*/
        boolean [][]visited=new boolean [A.length][A[0].length];
        int N=A.length;
        int M=A[0].length;
        int ans=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(A[i][j]==1){
                    if(!visited[i][j]){
                        dfs(A,visited,i,j);
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans);
    }

    private static void dfs(int[][] a, boolean[][] visited, int i, int j) {
        visited[i][j]=true;
        int n=a.length;
        int m=a[0].length;
        int rows[]=new int[]{-1,-1,0,1,1,1,0,-1};
        int cols[]=new int[]{0,1,1,1,0,-1,-1,-1};
        for(int k=0;k<7;k++){
                int newI=i+rows[k];
                int newJ=j+cols[k];
                if(newI>=0 && newI<n &&
                    newJ>=0 && newJ<m &&
                    a[newI][newJ]==1 &&
                    !visited[newI][newJ]){
                    dfs(a,visited,newI,newJ);
                }
        }
    }
}
