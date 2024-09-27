package Scaler.Assignment15022023;

public class PerfectNumber {
    public static void main(String[] args) {
        int isPerfect=findPerfect(1);
        System.out.println(isPerfect);

    }

    private static int findPerfect(int A) {
        int sum=1;
        for(int i=1;i*i<=A;i++){
            if(A%i==0){
                int secondFactor=A/i;
                if(i==secondFactor)
                    sum+=i;
                else{
                    sum=sum+i+secondFactor;
                }
            }
        }
        if(sum!=A)
            return 0;
        return 1;
    }
}
