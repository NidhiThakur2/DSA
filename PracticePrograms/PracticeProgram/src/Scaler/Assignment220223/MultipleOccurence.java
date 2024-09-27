package Scaler.Assignment220223;

public class MultipleOccurence {
    public static void main(String[] args) {
        int []A={1, 2, 1};
        int B=3,count=0;
        for(int i=0;i<A.length;i++){
            if(A[i]==B)
                count++;
        }
        System.out.println(count);
    }
}
