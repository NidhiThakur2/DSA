package PracticePrograms.Arrays;

public class MinimumInRoatatedArray {
    public static void main(String[] args) {
        int A[]=new int []{10, 20, 1,5 , 7};
        int ans=Integer.MAX_VALUE;
        int left=0;
        int right=A.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(A[mid]==A[left] && A[mid]==A[right]){
                ans=Math.min(ans,A[mid]);
                left++;
                right--;
            } else if (A[mid]>A[right]){
                left=mid+1;
            }else{
                ans=Math.min(ans,A[mid]);
                right=mid;
            }
        }
        System.out.println(ans);
    }
}
