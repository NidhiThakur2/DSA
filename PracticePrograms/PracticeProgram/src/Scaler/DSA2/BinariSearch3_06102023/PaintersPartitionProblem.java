package Scaler.DSA2.BinariSearch3_06102023;

public class PaintersPartitionProblem {
    public static void main(String[] args) {
        int C[]=new int[]{1000000,1000000};
        int A=1,B=1000000;
        long min_sum[]=findMinAndSum(C,A,B);
        long left=min_sum[0];
        long right=min_sum[1];
        long ans=-1;
        while(left<=right){
            long mid=(left+right)/2;
            if(isPossible(C,A,B,mid)){
                ans=mid;
                right=mid-1;
            }else
                left=mid+1;
        }
        System.out.println((int)(ans%10000003));

    }

    private static boolean isPossible(int[] c, int a, int b, long mid) {
        long sum=0;
        int p=1;
        for(int i=0;i<c.length;){
            long num=b*c[i];
            sum=sum+num;
            if(sum>mid){
                sum=0;
                p++;
                if(p>a)
                    return false;
            }else
                i++;

        }
        return true;
    }

    private static long[] findMinAndSum(int[] c,int a,int b) {
        long ans[]= new long[2];
        long max=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<c.length;i++){
            long num=(long)b*(long)c[i];
            sum=sum+num;
            max=Math.max(max,c[i]);
        }
        ans[0]=max*b;
        ans[1]=sum*b;
        return ans;
    }
}
