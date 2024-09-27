package PracticePrograms.Arrays;

import java.util.Arrays;

public class MaximumIndex {
    public static void main(String[] args) {
        int []a=new int[]{10, 1};
        int []minL=new int[a.length];
        int []maxR=new int[a.length];
        minL[0]=a[0];
        maxR[a.length-1]=a[a.length-1];
        for(int i=1;i<a.length;i++){
            minL[i]=Integer.min(a[i],minL[i-1]);
        }
        for(int i=a.length-2;i>=0;i--){
            maxR[i]=Integer.max(a[i],maxR[i+1]);
        }
        int i = 0;
        int j = 0;
        int maxDiff = -1;
        while(i<a.length && j<a.length){
            if (minL[i]<maxR[j]){
                maxDiff=Integer.max(maxDiff,j-i);
                j=j+1;
            }else{
                i=i+1;
            }
        }
        System.out.println(maxDiff);
       // Arrays.stream(maxR).forEach(System.out::println);
    }
}
