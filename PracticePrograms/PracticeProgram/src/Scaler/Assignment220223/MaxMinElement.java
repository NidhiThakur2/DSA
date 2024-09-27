package Scaler.Assignment220223;

public class MaxMinElement {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int []A={-2, 1, -4, 5, 3};
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
                max=A[i];
            if(A[i]<min)
                min=A[i];
        }
        System.out.println("min:"+min+",max:"+max);
    }

}
