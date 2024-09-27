package LeetCode;

import java.util.Arrays;

public class ClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] points=new int[][]{{1,3},{-2,2}};
        int k=1;
        Arrays.sort(points,(p1,p2)->{
            int p1Distance=p1[0]*p1[0]+p1[1]+p1[1];
            int p2Distance=p2[0]*p2[0]+p2[1]+p2[1];
            return p1Distance-p2Distance;
        });
        int [][]ans=Arrays.copyOfRange(points,0,k);
       for(int i=0;i<ans.length;i++){
           for(int j=0;j<ans[0].length;j++){
               System.out.print(ans[i][j]);
           }
           System.out.println();
       }
    }
}
