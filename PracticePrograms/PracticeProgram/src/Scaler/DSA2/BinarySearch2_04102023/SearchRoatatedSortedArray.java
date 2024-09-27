package Scaler.DSA2.BinarySearch2_04102023;

public class SearchRoatatedSortedArray {
    public static void main(String[] args) {
        int []A=new int[]{5, 1, 3};
        int B=5;
        int pivot=findPivot(A);
        int ans=-1;
        if(pivot==-1) {
            ans = binarySearch(A, B, 0, A.length - 1);
        }
        if(B>=A[0])
            ans=binarySearch(A,B,0,pivot-1);
        else
            ans=binarySearch(A,B,pivot,A.length-1);
        System.out.println(pivot);
        System.out.println(ans);
    }

    private static int binarySearch(int[] a, int b, int left, int right) {
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(b>a[mid]){
                left=mid+1;
            }else if(b<a[mid]){
                right=mid-1;
            }
            if(b==a[mid]){
                ans=mid;
                break;
            }
        }
        return ans;
    }

    private static int findPivot(int[] a) {
        int pivot=-1;
        int left=0,right=a.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(a[mid]>=a[0])
                left=mid+1;
            else{
                pivot=mid;
                right=mid-1;
            }
        }
        return pivot;

    }
}
