package Scaler.DSA4;

import java.util.ArrayList;

public class BuildAHeap {
    static ArrayList<Integer> ans=new ArrayList<>();
    public static void main(String[] args) {
        int []A=new int[]{5, 13, -2, 11, 27, 31, 0, 19};
        int N=A.length;
        for(int i=(N-2)/2;i>=0;i--){
            heapify(A,i);

        }



    }

    private static void heapify(int[] a, int i) {
        int N=a.length;
        int left=a[i*2+1];
        int right=i*2+2<N ? a[i*2+2]:-1;
        while(i<N){
            int minChild=Math.min(left,right);
            int min=Math.min(minChild,a[i]);
            if(min == left){
                //swap left with arr[i]
                int temp = a[i];
                a[i] = left;
                left = temp;

                i = 2*i + 1;
            }
            else if(min == right){
                // swap right child with arr[i]
                int temp = a[i];
                a[i] = right;
                right = temp;

                i = 2*i+2;
            }
            else{
                break;
            }
        }

    }
}
