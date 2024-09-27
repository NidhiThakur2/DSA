package Scaler.DSA4;

import java.util.PriorityQueue;

public class ConnectRopes {
    public static void main(String[] args) {
        int []A = new int[]{1, 2, 3, 4, 5};
        int sum=0;
        int ans=0;
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int i=0;i<A.length;i++){
            heap.add(A[i]);
        }
        while(heap.size()>1){
            sum=heap.remove()+heap.remove();
            heap.add(sum);
            ans=ans+sum;

        }
        System.out.println(ans);
    }
}
