package Scaler.Assignment17032023;

public class ModArray {
    public static void main(String[] args) {
        int []A={1,2,3,4,3,5,5,5,5,5};
        int B=34567;
        int N=A.length;
        long number=0;
        long placeValue=1;
        for(int i=N-1;i>=0;i--){
            number=(number+A[i]*placeValue)%B;
            placeValue=(placeValue*10)%B;
        }
        System.out.println(number%B);
    }
}
