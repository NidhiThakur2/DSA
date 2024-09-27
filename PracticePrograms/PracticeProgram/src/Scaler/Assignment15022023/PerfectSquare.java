package Scaler.Assignment15022023;

public class PerfectSquare {
    public static void main(String[] args) {
        int sqrt=findSqrt(1000000000);
        System.out.println(sqrt);

    }
    private static int findSqrt(int A){
        int ans=-1,i=1;
        while(i*i<=A){
            if(i*i==A) {
                ans=i;
                return ans;
            }
            i++;
        }
        return ans;
    }
}
