package Scaler.Assignment31032023;

import java.util.ArrayList;

public class SubArraySumEqualsK1 {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(-2);
        A.add(16);
        A.add(-12);
        A.add(5);
        A.add(7);
        A.add(-1);
        A.add(2);
        A.add(12);
        A.add(11);
        Integer B=17;
        int sum=0;
        int count=0;
        for(int i=0;i<A.size();i++){
            sum=0;
            for(int j=i;j<A.size();j++){
                sum=sum+A.get(j);
                if(sum==B)
                    count++;
            }
        }
        System.out.println(count);
    }
}
