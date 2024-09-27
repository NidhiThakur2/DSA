package Scaler.Assignment27022023;

public class Bulbs {
    public static void main(String[] args) {
        int []A={1,1,1,1,1};
        int count=0;
        int orignalState=-1;
        for(int i=0;i<=A.length-1;i++){
            if(count%2==0 || count==0)
                orignalState=A[i];
            else{
                if(A[i]==0)
                    orignalState=1;
                if(A[i]==1)
                    orignalState=0;
            }
            if(orignalState==0)
                count++;
        }
        System.out.println(count);
    }
}
