package Scaler.Assignment6032023;

public class MinimumSwaps {
    public static void main(String[] args) {
        int []A={52, 7, 93, 47, 68, 26, 51, 44, 5, 41, 88, 19, 78, 38, 17, 13, 24, 74, 92, 5, 84, 27, 48, 49, 37, 59, 3, 56, 79, 26, 55, 60, 16, 83, 63, 40, 55, 9, 96, 29, 7, 22, 27, 74, 78, 38, 11, 65, 29, 52, 36, 21, 94, 46, 52, 47, 87, 33, 87, 70};
        //int []A={5, 17, 100, 11};
        //int []A={1, 12, 10, 3, 14, 10, 5};
        int B=19;
        int count=findCount(A,B);
        int swaps=findSwaps(A,B,count);
        System.out.println(swaps);
    }

    private static int findSwaps(int[] A,int B, int count) {
        int start=0,end=count-1;
        int swap=0,ans=0;
        for(int i=start;i<=end;i++){
            if(A[i]>B)
                swap++;
        }
        //System.out.println(swap);
        ans=swap;
        start++;
        end++;
        while(end<A.length-1){
            if(A[end]>B && A[start-1]<=B)
                swap++;
            if (A[end]<=B && A[start-1]>B) {
                swap--;
            }
            if(swap<ans)
                ans=swap;
            start++;
            end++;
        }
        return ans;
    }

    private static int findCount(int[] a,int b) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=b)
                count++;
        }
        //System.out.println(count);
        return count;
    }
}
