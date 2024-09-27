package Scaler.Assignment15022023;

public class FactorCount {
    public static void main(String[] args) {
        int result=solve(6);
        System.out.println(result);
    }
    private static  int solve(int A) {
        int sqrt=findSqrt(A);
        int count=0;
        for(int i=1;i<=sqrt;i++){
            if(A%i==0) {
                if (i == A/i)
                    count++;
                else
                    count += 2;
            }
        }
        return count;
    }
    private static int findSqrt(int A){
        int ans=1,i=1;
        while(i*i<=A){
            ans=i;
            i++;

        }
        return ans;
    }
}
