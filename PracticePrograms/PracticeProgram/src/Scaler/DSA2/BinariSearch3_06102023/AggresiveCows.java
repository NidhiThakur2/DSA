package Scaler.DSA2.BinariSearch3_06102023;

//import static Scaler.DSA2.BinariSearch3_06102023.PaintersPartitionProblem.isPossible;

public class AggresiveCows {
    public static void main(String[] args) {
        int []A=new int[]{1, 2, 3, 4, 5};
        int B=3;
        int ans=moo(A,A.length,B);
        System.out.println(ans);
    }

    private static int moo(int[] a, int length, int b) {
        int left=minDistance(a);
        int right=a[length-1]-a[0];
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(isPossible(mid,a,b)){
                ans=mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int mid, int[] a, int b) {
        int last_placed_cow=a[0];
        int count=1;
        for(int i=1;i<a.length;i++){
            if(a[i]-last_placed_cow>=mid){
                count+=1;
                last_placed_cow=a[i];
                if(count==b)
                    return true;
            }
        }
        return false;
    }

    private static int minDistance(int[] a) {
        int min=a[1]-a[0];
        for(int i=2;i<=a.length-1;i++){
            int dist=a[i]-a[i-1];
            min=Math.min(min,dist);
        }
        return min;
    }
}
