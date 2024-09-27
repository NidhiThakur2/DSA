package Scaler.Assignment27022023;

public class PickFromBothSide {
    public static void main(String[] args) {
        int []A={5, -2, 3 , 1, 2};
        int B=3;
        int i=0,k=1,sum=0,max=sum;
        while(k<=B){
            sum=sum+A[i];
            i++;
            k++;
        }
        i=i-1;
        k=1;
        max=sum;
        int j=A.length-1;
        while(k<=B){
            sum=sum-A[i]+A[j];
            i--;
            j--;
            k++;
            if(sum>max)
                max=sum;
        }
        System.out.println(max);
    }
}
