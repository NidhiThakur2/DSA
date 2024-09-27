package PracticePrograms.Arrays;

public class MajorityElementBitManipulation {
    public static void main(String[] args) {
        int []arr=new int[]{1,2,3,3};
        int oneCount=0,zeroCount=0;
        int majorityElement=0;
        for(int i=0;i<32;i++){
            for(int a:arr){
                if(((a>>i)&1)==1){
                    oneCount++;
                }else{
                    zeroCount++;
                }
            }
            if(oneCount>zeroCount){
                majorityElement=majorityElement | (1<<i);
            }
        }
        int countMajority=0;
        for(int a:arr){
            if(a==majorityElement)
                countMajority++;
        }
        if(countMajority>=(arr.length/2))
            System.out.println(majorityElement);
        else
            System.out.println(-1);

    }
}
