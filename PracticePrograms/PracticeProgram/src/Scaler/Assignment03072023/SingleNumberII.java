package Scaler.Assignment03072023;

public class SingleNumberII {
    public static void main(String[] args) {
        int []A=new int []{1, 2, 4, 3, 3, 2, 2, 3, 1, 1};
        int ans=0;
        for(int i=0;i<=31;i++){
            int count=0;
            for(int j=0;j<A.length;j++){
                if(checkBit(A[j],i)==true){
                    count++;
                }
            }
            if(count%3!=0){
                ans=ans|(1<<i);
            }
        }
        System.out.println(ans);
    }
    static boolean checkBit(int num,int i){
        if((num>>i&1)==1)
            return true;
        return false;
    }
}
