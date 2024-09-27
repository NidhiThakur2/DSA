package Scaler.Contest;

import java.util.ArrayList;

public class JerryAnsDivisibilityBy9 {
    public static void main(String[] args) {
        ArrayList<Integer>A=new ArrayList<>();
        ArrayList<Integer>pf=new ArrayList<>();
        A.add(6);
        A.add(9);
        A.add(18);
        A.add(5);
        A.add(27);

        int max=0;
        int sum=0, prevSum=0;
        for(int i=0;i<A.size();i++){
            int digitSum=0;
            int num=A.get(i);
            while(num!=0){
                digitSum=digitSum+(num%10);
                num=num/10;
            }
            if(digitSum%9==0)
                pf.add(i,1);
            else
                pf.add(i,0);
        }
      //  pf.stream().forEach(System.out::println);
        for(int i=0;i<pf.size();i++){
            prevSum=sum;
            sum=sum+pf.get(i);
            if(sum!=prevSum){
                if(sum>max)
                    max=sum;
            }else{
                prevSum=0;
                sum=0;
            }
        }
        System.out.println(max);
    }
}
