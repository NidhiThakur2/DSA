package PracticePrograms.Arrays;

import java.util.Arrays;

public class MinimizeHeightII {
    public static void main(String[] args) {
        int []A=new int[]{1, 5, 8, 10};
        int k=2;
        int n=A.length;
        Arrays.sort(A);
        int ans=A[n-1]-A[0];
        int min=A[0]+k;
        int max=A[n-1]-k;
        for(int i=0;i<n-1;i++){
          min=Math.min(min,A[i+1]-k);
          max=Math.max(max,A[i]+k);
          if(min<0)
              continue;
          ans=Math.min(ans,max-min);
        }
        System.out.println(ans);
    }
}
