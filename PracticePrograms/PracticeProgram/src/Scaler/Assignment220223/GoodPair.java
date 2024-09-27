package Scaler.Assignment220223;

public class GoodPair {
    public static void main(String[] args) {
        int A[]={1,2,2};
        int k=4;
        int count=0;
        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]+A[j]==k)
                    count++;
            }
        }
        System.out.println(count);
    }
}
