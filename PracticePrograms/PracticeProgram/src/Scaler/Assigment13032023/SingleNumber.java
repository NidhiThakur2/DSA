package Scaler.Assigment13032023;

public class SingleNumber {
    public static void main(String[] args) {
        int A[]={1, 2, 2};
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans=ans^A[i];
        }
        System.out.println(ans);
    }
}
