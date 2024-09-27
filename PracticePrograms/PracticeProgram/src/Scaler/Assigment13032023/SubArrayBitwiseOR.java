package Scaler.Assigment13032023;

public class SubArrayBitwiseOR {
    public static void main(String[] args) {
        int B[]={1,0};
        int A=3;
        int subArrayCount=0;
        int zeroCount=0;
        int []pa=new int[B.length];
        for(int i=B.length-1;i>=0;i--){
            if(B[i]==0){
                zeroCount++;
                pa[i]=zeroCount;
            }else{
                zeroCount=0;
                pa[i]=0;
            }
        }
        for(int i=0;i<B.length;i++){
            int indexSubArrays=B.length-(i+pa[i]);
            subArrayCount=subArrayCount+indexSubArrays;
        }
        System.out.println(subArrayCount);
    }
}
