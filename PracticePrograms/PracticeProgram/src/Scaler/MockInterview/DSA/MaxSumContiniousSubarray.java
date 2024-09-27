package Scaler.MockInterview.DSA;

import java.util.ArrayList;

public class MaxSumContiniousSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-2);
        A.add(1);
        A.add(-3);
        A.add(4);
        A.add(-1);
        A.add(2);
        A.add(1);
        A.add(-5);
        A.add(4);
        int sum=0;
        int max=A.get(0);
        for(int i=0;i<A.size();i++){
            sum+=A.get(i);
            if(max<sum){
                max=sum;
            }if(sum<0)
                sum=0;
        }
        System.out.println(max);

    }
}
