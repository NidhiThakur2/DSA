package Scaler.Assigment13032023;

public class InterestingArray {
    public static void main(String[] args) {
        int []A={3,9,2,8};
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans=ans^A[i];
        }
        if(ans%2==0)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
