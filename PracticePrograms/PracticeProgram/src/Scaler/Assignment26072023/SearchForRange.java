package Scaler.Assignment26072023;

import java.util.Arrays;

public class SearchForRange {
    public static void main(String[] args) {
        int A[]=new int[]{ 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 8, 8, 8, 9, 9, 9, 10, 10, 10};
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        int B=4;
        int left=0;
        int right=A.length-1;
        int mid=0;
        if(A.length==1 && A[0]==B){
            ans[0]=0;
            ans[1]=0;
            System.out.println(ans);
        }
        while(left<=right){
            mid=(left+right)/2;
            if (A[mid]==B) {
                while(A[left]!=B)
                    left++;
                while(A[right]!=B)
                    right--;
                ans[0]=left;
                ans[1]=right;
              break;

            }else if(A[mid]<B){
                left=mid+1;
            }else
                right=mid-1;
        }

        Arrays.stream(ans).forEach(System.out::println);
    }
}
