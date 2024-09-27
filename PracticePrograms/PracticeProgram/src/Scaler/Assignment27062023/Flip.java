package Scaler.Assignment27062023;

import java.util.Arrays;

public class Flip {
    public static void main(String[] args) {
        String A="1101000";
        int left=0,right=-1,maxLength=0,currLength=0;
        int indx=0;
        int []pf=new int[A.length()];
        int ans[]=new int[2];
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='1')
                pf[i]=-1;
            else
                pf[i]=1;
        }
        for(int i=0;i<pf.length;i++){
            currLength+=pf[i];
            if(currLength<0){
                currLength=0;
                indx=i+1;
            }
            else if(currLength>maxLength){
                left=indx;
                right=i;
                maxLength=currLength;
            }
        }
        if(right!=-1){
            ans=new int[2];
            ans[0]=left+1;
            ans[1]=right+1;
        }else if(currLength==0 && right==-1){
            ans=new int[0];
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
