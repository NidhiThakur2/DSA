package LeetCode;

public class MaximumSumSubArrayDivideAndConquer {
    public static void main(String[] args) {
        int arr[]=new int[]{2, 3, 4, 5, 7};
        int mid=(0+arr.length-1)/2;
        int ans=maxSumSubArray(arr,0,arr.length-1);
        System.out.println(ans);
    }

    private static int maxSumSubArray(int[] arr, int left, int right) {
        if(left>right)
            return Integer.MIN_VALUE;
        if(left==right)
            return arr[left];
        int m=(left+right)/2;
        return Math.max(
                Math.max(maxSumSubArray(arr,left,m-1),maxSumSubArray(arr,m+1,right)),
                maxCrossingSum(arr,left,m,right));
    }

    private static int maxCrossingSum(int[] arr, int left, int m, int right) {
        int leftSum=0,rightSum=0;
        for(int i=left;i<=m;i++){
            leftSum=leftSum+arr[i];
        }
        for(int i=m;i<=right;i++){
            rightSum=rightSum+arr[i];
        }
        return Math.max(leftSum+rightSum-arr[m],Math.max(leftSum,rightSum));
    }
}
