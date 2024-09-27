package Scaler.Assignment17032023;

public class DivisibilityBy3 {
    public static void main(String[] args) {
        int A[]={1, 0, 0, 1, 2};
        int sum=0;
        for(int i=0;i<=A.length-1;i++){
            sum=sum+A[i];
        }
        if(sum%3!=0)
            System.out.println(0);
        else
            System.out.println(1);

    }
}
