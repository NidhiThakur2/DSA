package PracticePrograms.Arrays;

import java.util.Arrays;

public class NegativeNumbersToEnd {
    public static void main(String[] args) {
        int nums[]=new int[]{1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(nums,nums.length);
        Arrays.stream(nums).forEach(System.out::println);
    }
    static void segregateElements(int arr[],int n)
    {
        rearrange(arr,0,n-1);

    }
    static void rearrange(int arr[], int l, int r){
        if(l>=r)
            return ;

        int mid = (l+r)/2;
        rearrange(arr,l,mid);
        rearrange(arr,mid+1,r);

        merge(arr,l,mid,r);
    }
    static void merge(int arr[], int l, int m, int r){
        int i=l,j=m+1;

        while(i<=m && arr[i] >= 0)
            i++;

        while(j<=r && arr[j] >= 0)
            j++;

        reverse(arr,i,m);
        reverse(arr,m+1,j-1);
        reverse(arr,i,j-1);
    }
    static void reverse(int arr[], int l, int r){

        while(l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;

            l++;
            r--;
        }

    }
}
