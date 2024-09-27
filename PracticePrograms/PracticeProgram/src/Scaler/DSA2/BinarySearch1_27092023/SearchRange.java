package Scaler.DSA2.BinarySearch1_27092023;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
        int A[]=new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int B=6;
        int ans[]=new int[]{-1,-1};
        int n=A.length;
        if(n==1 && A[0]==B){
            ans[0]=0;
            ans[1]=0;
        }
        ans=findRange(A,B,0,A.length-1);
        Arrays.stream(ans).forEach(System.out::println);
    }

    private static int[] findRange(int[] a,int b, int l, int r) {
        int ans[]=new int[]{-1,-1};
        if(l>r)
            return ans;
        int mid=(l+r)/2;
        if(a[mid]==b || a[l]==b || a[r]==b) {
            int lmost = l , rmost = r;
            if(a[l]==b){
                lmost=l;
                rmost=l;
            }
            else if(a[r]==b){
                lmost=r;
                rmost=r;
            }else{
                lmost = mid;
                rmost = mid;
            }
            //int lmost = mid , rmost = mid + 1;
            while(a[lmost]==a[rmost]){
                ans[0]=lmost;
                ans[1]=rmost;
                if(lmost>=0)
                    lmost=lmost-1;
                if(rmost<=a.length-1)
                    rmost=rmost+1;
            }
            while(a[lmost]==b && lmost>=0){
                ans[0]=lmost;
                ans[1]=rmost-1;
                lmost=lmost-1;
            }
            while(a[rmost]==b && rmost<a.length){
                ans[0]=lmost+1;
                ans[1]=rmost;
                rmost=rmost+1;
            }
            return ans;
        }
        else if(a[mid]<b)
            return findRange(a,b,mid+1,r);
        else
            return findRange(a,b,l,mid-1);

    }
}
