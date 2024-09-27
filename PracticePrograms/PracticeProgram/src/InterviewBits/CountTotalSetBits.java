package InterviewBits;

public class CountTotalSetBits {
    public static void main(String[] args) {
        int A=64;
        int ans=0;
        for(int i=1;i<=A;i++){
            int count=countSetBits(i);
            System.out.println("num: "+i+"count:"+count);
           ans=ans+count;
        }
       // System.out.println(ans);
        System.out.println(ans%(1000000000+7));
    }
    private static int countSetBits(int num){
        int count=0;
        while(num>0){
            if((num&1)==1)
                count++;
            num=num>>1;
        }
        return count;

    }

    public static class MaxSubList {

    }
}
