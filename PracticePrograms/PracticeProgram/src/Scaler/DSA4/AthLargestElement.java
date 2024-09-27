package Scaler.DSA4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class AthLargestElement {
    public static void main(String[] args) {
        int[] B = new int[]{15, 20, 99, 1};
        int A = 2;
        int ans[] = new int[B.length];
        PriorityQueue<Integer> mh = new PriorityQueue<>();
        for (int i = 0; i < A; i++) {
            mh.add(B[i]);
            if(mh.size()<A)
                ans[i]=-1;
            else
                ans[i]=mh.peek();
        }
        for(int i=A;i<B.length;i++){
            if(mh.peek()<B[i]){
                mh.remove();
                mh.add(B[i]);
            }
            ans[i]=mh.peek();
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
