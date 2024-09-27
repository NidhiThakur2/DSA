package InterviewBits;

import java.util.ArrayList;

public class MaxNonNegativeSubArray1 {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> maxArray=new ArrayList<>();
        ArrayList<Integer> newArray=new ArrayList<>();
        int newSum=0,maxSum=newSum;
        A.add(0);
        A.add(0);
        A.add(-1);
        A.add(0);
        for(int i=0;i<A.size();i++){
            if(A.get(i)<0){
                newSum=0;
                newArray=new ArrayList<>();
            }else {
                newSum = newSum + A.get(i);
                newArray.add(A.get(i));
            }
            if(newSum>maxSum || ((newSum==maxSum)&& (newArray.size()>maxArray.size()))){
                maxSum=newSum;
                maxArray=newArray;
            }

        }
        maxArray.stream().forEach(System.out::println);
    }
}
