package PracticePrograms.Arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {
        int []A=new int[]{2, 3, 4, 5, -1, 0};
        int maxProduct=Integer.MIN_VALUE;
        int n=A.length;
        int pf=1;
        int sf=1;
        for(int i=0;i<A.length;i++){
            if(A[i]==0){
                pf=1;
                sf=1;
            }
            pf=pf*A[i];
            sf=sf*A[n-i-1];
            maxProduct=Integer.max(maxProduct,Integer.max(pf,sf));

        }
        System.out.println(maxProduct);
    }
}
