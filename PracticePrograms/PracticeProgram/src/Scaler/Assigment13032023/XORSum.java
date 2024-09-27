package Scaler.Assigment13032023;

public class XORSum {
    public static void main(String[] args) {
        int A=6,tempA=A;
        int B=12,tempB=B;
        int i=0;
        int X=0;
        while(tempA>0 || tempB>0){
            int bitAi=checkBit(tempA);
            int bitBi=checkBit(tempB);
            if(bitAi==1 && bitBi==1) {
                int pow = pow(2, i);
                X = X + pow;
            }
            i++;
            tempA=tempA>>1;
            tempB=tempB>>1;

        }
        int result=(A^X) + (B^X);
        System.out.println(result);

    }

    private static int pow(int num, int pow) {
        int ans=1;
        if(pow==0)
            return 1;
        else
            ans=num*pow(num,pow-1);
        return ans;
    }

    private static int checkBit(int a) {
        if((a&1)==1)
            return 1;
        else
            return 0;

   }
}
