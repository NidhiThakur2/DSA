package Scaler.MockInterview.DSA;

import java.util.Arrays;

public class PainterPartisionProblem {
    public static void main(String[] args) {
        int []A=new int[]{3,5,1,7,8,2,5,3,10,1,4,7,5,4,6};
        int p=3;
        Integer sum=Arrays.stream(A).sum();
        int max=10;
        int left=max;
        int right=sum;
        int ans=0;
        while(left<right){
            int mid=(left+right)/2;
            if(check(A,mid,p)) {
                ans=mid;
                right=mid;
            }else{
                left=mid+1;
            }
        }
        System.out.println(ans);
    }

    private static boolean check(int[] a, int mid, int p) {
        int w=1;
        int current_work=0;
        for(int i=0;i<a.length;i++){
            if(current_work+a[i]<=mid){
                current_work+=a[i];
            }else{
                w++;
                current_work=a[i];
            }
        }
        if(w>p)
            return false;
        return true;
    }
}
