package Scaler.Assigment13032023;

import java.util.ArrayList;

public class DesimalToAnyBase {
    public static void main(String[] args) {
        int num=4;
        int base=2;
        int result=findDesimalToAnyBase(num,base);
        System.out.println(result);
    }

    private static int findDesimalToAnyBase(int num,int base) {
        ArrayList<Integer> remainders=new ArrayList<>();
        int q=num;
        while(q>0){
            int rem=q%base;
            remainders.add(rem);
            q=q/base;
        }
        int position=powOf10(remainders.size());
        int ans=0;
        for(int i=remainders.size()-1;i>=0;i--){
            int temp=position*remainders.get(i);
            ans=ans+temp;
            position=position/10;
        }
        return ans;

    }

    private static int powOf10(int size) {
        int ans=1;
        for(int i=1;i<size;i++){
            ans=ans*10;
        }
        return ans;
    }
}
