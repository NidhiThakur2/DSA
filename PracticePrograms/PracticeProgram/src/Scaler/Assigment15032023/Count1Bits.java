package Scaler.Assigment15032023;

public class Count1Bits {
    public static void main(String[] args) {
        int A=7;
        int setBitCount=0;
        while(A>0){
            int result=A&1;
            if(result!=0)
                setBitCount++;
            A=A>>1;
        }
        System.out.println(setBitCount);
    }
}
