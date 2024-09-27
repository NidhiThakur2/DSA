package Scaler.Assignment27062023;

import java.util.ArrayList;

public class AddOneNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(0);
        A.add(1);
        ArrayList<Integer> result=new ArrayList<Integer>();
        int carry=0,sum=0,n=A.size();
        for(int i=n-1;i>=0;i--){
            sum=0;
            if(i==n-1)
                sum=1;
            sum=sum+carry+A.get(i);
            if(sum>9){
                result.add(sum%10);
                carry=sum/10;
            }else{
                carry=0;
                result.add(sum);
            }
        }
        if(carry!=0){
            result.add(carry);
        }
        int left=0,right=result.size()-1;
        int found=0;
        while(left<right){
            if(result.get(right)==0 && found==0) {
                result.remove(right);
            }
           else{
               found=1;
               int temp = result.get(left);
                  result.set(left, result.get(right));
                  result.set(right, temp);
                  left++;
           }
            right--;
        }
        result.stream().forEach(System.out::println);
    }
}
