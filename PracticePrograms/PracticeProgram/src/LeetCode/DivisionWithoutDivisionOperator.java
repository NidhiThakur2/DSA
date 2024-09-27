package LeetCode;

public class DivisionWithoutDivisionOperator {
    public static void main(String[] args) {
       int dividend=-10,divisor=3;
      //  int sign=1;
        int ans=divide(dividend,divisor);

        System.out.println(ans);
    }
    public static int divide(int dividend, int divisor) {
        int sign=1;
        int result=0;
        long q=0;
        long dd = (long)dividend , dv = (long)divisor;
        dd = Math.abs(dd);dv = Math.abs(dv);
        if((dividend<0 && divisor>0) || (dividend>0 && divisor<0))
            sign=-1;
        while(dd>=dv){
            int shift=0;
            while(dd >= (dv<<shift)){
                shift++;
            }
            q+=(long)1l<<(shift-1);
            dd-=dv<<(shift-1);
        }
        if(sign==1){
            if(q>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            return (int)q;
        }else {
            if((~q)+1<Integer.MIN_VALUE) {
                System.out.println(~q);
                return Integer.MIN_VALUE;

            }
            System.out.println(q);
            return (int)(~q)+1;
        }


    }
}
