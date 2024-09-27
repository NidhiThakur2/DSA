package Scaler.Assignment19072023;

public class KthSmallestElement {
    public static void main(String[] args) {
        int A[]=new int[]{2, 1, 4, 3, 2};
        int k=3;
        for(int i=0;i<3;i++){
            int mIndex=i;
            for(int j=i;j<A.length;j++){
                if(A[j]<A[mIndex])
                    mIndex=j;
            }
            int temp=A[i];
            A[i]=A[mIndex];
            A[mIndex]=temp;
        }
        System.out.println(A[k-1]);
    }
}
