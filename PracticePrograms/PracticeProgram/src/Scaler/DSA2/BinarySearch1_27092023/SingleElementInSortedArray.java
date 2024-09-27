package Scaler.DSA2.BinarySearch1_27092023;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int []A=new int[]{25,25,42,42,70,70,82,82,118,118,139,139,191,191,208,257,257,264,264,278,278,334,334,406,406,430,430,436,436,484,484};

        int ans=-1,n=A.length;
        int left=0,right=n-1;
        if(n==1)
            ans= A[0];
        if(A[0]!=A[1])
            ans= A[0];
        if(A[n-1]!=A[n-2])
            ans=A[n-1];
        if(ans==-1) {
            ans = searchUnique(A, left, right);
        }
        System.out.println(ans);
    }

    private static int searchUnique(int[] a, int left, int right) {
       if(left>=right)
           return -1;


       int mid=(left+right)/2;
        if(a[left]!=a[left+1])
            return a[left];
        if(a[right-1]!=a[right])
            return a[right];
       if(a[mid]!=a[mid-1] && a[mid]!=a[mid+1]){
           return a[mid];
       }
        if(a[mid]==a[mid-1])
            mid=mid-1;
        if(mid%2!=0)
            return searchUnique(a,left,mid-1);
        else
           return searchUnique(a,mid+2,right);

    }
}
