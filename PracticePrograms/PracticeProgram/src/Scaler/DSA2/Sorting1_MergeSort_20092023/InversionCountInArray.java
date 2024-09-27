package Scaler.DSA2.Sorting1_MergeSort_20092023;

public class InversionCountInArray {
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,1,3,5};
        int left=0,right=arr.length-1;
        int ans=inversionCount(arr,left,right);
        System.out.println(ans);

    }
    private static int inversionCount(int[] arr, int left, int right) {
        if(left==right)
            return 0;
        int mid=(left+right)/2;
        int lc=inversionCount(arr,left,mid);
        int rc=inversionCount(arr,mid+1,right);
        int c=merge(arr,left,mid,right);
        return lc+rc+c;
    }
    private static int merge(int[] arr, int left, int mid, int right) {
        int i=left,j=mid+1,k=0;
        int count=0;
        int []c=new int[right-left+1];
        while(i<=mid && j<=right){
            if(arr[i]<=arr[j]) {
                c[k]=arr[i];
                i++;
                k++;
            }else if(arr[i]==arr[j]){
                c[k]=arr[i];
                i++;
                j++;
                k++;
            }
            else{
                c[k]=arr[j];
                j++;
                k++;
                count+=mid-i+1;
            }
        }
        while(i<=mid){
            c[k]=arr[i];
            i++;
            k++;
        }
        while(j<=right){
            c[k]=arr[j];
            j++;
            k++;
        }
        k=0;i=left;
        while(i<=right){
            arr[i]=c[k];
            k++;
            i++;
        }
        return count;
    }
}
