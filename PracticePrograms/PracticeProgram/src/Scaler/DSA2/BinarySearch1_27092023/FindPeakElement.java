package Scaler.DSA2.BinarySearch1_27092023;

public class FindPeakElement {
    public static void main(String[] args) {
        int[] A=new int[]{5, 17, 100, 101,95};
        int l=0,r=A.length-1,n=A.length;
        int ans=-1;
        if (A[0]>A[1])
            ans=A[0];
        if(A[n-1]>A[n-2])
            ans=A[n-1];
        if(ans==-1)
            ans=findPeak(A,l,r);
        System.out.println(ans);

    }

    private static int findPeak(int[] a, int l, int r) {
        if(l>r)
            return -1;
        int mid=(l+r)/2;
        if(a[mid]>a[mid-1] && a[mid]>a[mid+1])
            return a[mid];
        else if(a[mid]>a[mid-1])
            return findPeak(a,mid+1,r);
        else
            return findPeak(a,l,mid-1);

    }
}
