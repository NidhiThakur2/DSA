package Scaler.DSA4.Greedy;

public class DistributeCandy {
    public static void main(String[] args) {
        int []A = new int[]{1, 5, 2, 1};
       // int candies[]=new int[A.length];

        int left[]=new int[A.length];
        left[0]=1;
        for(int i=1;i<A.length;i++){
            if(A[i]>A[i-1])
                left[i]=left[i-1]+1;
            else
                left[i]=1;
        }
        int right[]=new int[A.length];
        right[right.length-1]=1;
        for(int i=right.length-2;i>0;i--){
            if(A[i]>A[i+1])
                right[i]=right[i+1]+1;
            else
                right[i]=1;
        }
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans=ans+Math.max(left[i],right[i]);
        }
        System.out.println(ans);
    }
}
