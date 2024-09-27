package Scaler.Assigment15032023;

public class ReverseBits {
    public static void main(String[] args) {
        int A=3,i=0;
        long result=0;
        while(A>0){
            if((A&1)!=0) {
                int bit=31-i;
                result = result | ((long)1<<bit);
            }
            i++;
            A=A>>1;
        }
        System.out.println(result);
    }
}
