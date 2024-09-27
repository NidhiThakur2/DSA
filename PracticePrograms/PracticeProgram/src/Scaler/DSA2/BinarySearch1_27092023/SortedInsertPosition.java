package Scaler.DSA2.BinarySearch1_27092023;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A= new int[]{1, 3, 5, 6};
        int B=7;
        int l=0;
        int r=A.length-1;
        int ans=-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(A[mid]<B)
                l=mid+1;

            else if(A[mid]>B)
                r=mid-1;
            else{
                ans=mid;
                System.out.println(ans);
                return;
            }
        }
        l=0;
        r=A.length-1;
        int mid=-1;
        while (l <= r) {
                mid = (l + r) / 2;
                if (A[mid] > B) {
                    ans = mid;
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        if(ans==-1)
            ans=mid+1;
        System.out.println(ans);
    }
}
