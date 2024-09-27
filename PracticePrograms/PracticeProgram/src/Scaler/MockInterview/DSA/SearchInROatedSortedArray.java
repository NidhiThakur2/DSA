package Scaler.MockInterview.DSA;

public class SearchInROatedSortedArray {
    public static void main(String[] args) {
        int []A=new int[]{6, 7, 0, 1, 2, 4, 5};
        int target=0;
        int n=A.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int mid=(left+right)/2;
            if(A[0]<=A[mid]){
                if(A[0]<=target && target<=A[mid]){
                    right=mid;
                }else{
                    left=mid+1;
                }
            }else{
                if(A[mid]<target && target<=A[n-1]){
                    left=mid+1;
                }else{
                    right=mid;
                }
            }

        }
        System.out.println(A[left]==target?left:-1);
    }
}
