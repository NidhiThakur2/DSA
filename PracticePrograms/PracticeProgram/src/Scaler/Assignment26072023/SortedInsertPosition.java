package Scaler.Assignment26072023;

public class SortedInsertPosition {
    public static void main(String[] args) {
        int[] A=new int[]{1,4,9};
        int B=3;
        int left=0;
        int right=A.length-1;
        int mid=(left+right)/2;
        int ans=-1;
        while(left<=right){
            if(A[mid]==B) {
                ans=mid;
                break;
            }else if(B<A[mid]){
                right=mid-1;

            }else{
                left=mid+1;
            }
            mid=(left+right)/2;

        }
        if(ans==-1){
            ans=left;
        }
        System.out.println(ans);
    }
}
