package PracticePrograms.Arrays;

import java.util.HashSet;

public class SubArraySum0 {
    public static void main(String[] args) {
        int []A=new int[]{4,2,0,1,6};
        int pf=0;
        int sf=0;
        int n=A.length;
        HashSet<Integer> hs=new HashSet<>();
        boolean ans=false;
        int sum=0;
        for(int i=0;i<A.length;i++){
           sum=sum+A[i];
           if(sum==0 || A[i]==0 || hs.contains(sum))
               ans=true;
           else
               hs.add(sum);
        }

        System.out.println(ans);
    }
}
