package Scaler.Assignment31032023;

import java.util.ArrayList;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        int B=5;
        ArrayList<Integer> result=new ArrayList<>();
        int N=A.size(),start=0,end=0;
        int sum=A.get(0);
        while(end<=N-1){
            if(sum==B){
                for(int i=start;i<=end;i++){
                    result.add(A.get(i));
                }
                break;
            }else if(sum>B){
                sum=sum-A.get(start);
                start++;
            }else{
                end++;
                if(end<=N-1)
                    sum=sum+A.get(end);

            }
        }
        if(result.size()==0)
            result.add(-1);

        result.stream().forEach(System.out::println);

    }
}
