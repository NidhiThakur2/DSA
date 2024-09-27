package Scaler.Assignment26072023;

public class FindPeakElement {
    public static void main(String[] args) {
        int A[]=new  int[]{1,17,100,11};
        int left=0;
        int right=A.length-1;
        if(A[left]>A[left+1])
            System.out.println(A[left]);
        if(A[right]>A[right-1])
            System.out.println(A[right]);

        while(left<=right){
            int mid=(left+right)/2;
            if(A[mid]>A[mid-1] && A[mid]>A[mid+1]){
                System.out.println(A[mid]);
                break;
            }else if(A[mid]>A[mid-1]){
                left=mid+1;
            }else{
                right=mid-1;
            }

        }
    }
}
