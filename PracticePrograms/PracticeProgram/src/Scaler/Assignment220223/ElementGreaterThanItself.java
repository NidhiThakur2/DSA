package Scaler.Assignment220223;

public class ElementGreaterThanItself {
    public static void main(String[] args) {
        int []arr={6};
        int count= findCount(arr);
        System.out.println(count);
    }

    private static int findCount(int[] A) {
        int max=A[0];
        int count=0;
        if(A.length==1)
            return A.length;
        for(int i=1;i<A.length;i++){
            if(A[i]>max) {
                count=1;
                max = A[i];
            }else{
                if(A[i]==max)
                    count++;
            }
        }

        return A.length-count;

    }
}
