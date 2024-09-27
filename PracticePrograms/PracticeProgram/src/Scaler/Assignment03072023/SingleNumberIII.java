package Scaler.Assignment03072023;

import javax.swing.*;
import java.util.Arrays;

public class SingleNumberIII {
    public static void main(String[] args) {
        int []A=new int[]{186,256,102,377,186,377};
        int ans[]=new int[2];
        int numbersXOR=0;
        int position=-1;
        for(int i=0;i<A.length;i++){
            numbersXOR=numbersXOR^A[i];
        }
        for(int i=0;i<=31;i++){
            if(checkBit(numbersXOR,i)==true) {
                position = i;
                break;
            }
        }
        int set=0,unset=0;
        for(int i=0;i<A.length;i++){
            if(checkBit(A[i],position)==true)
                set=set^A[i];
            else
                unset=unset^A[i];
        }
        System.out.println(set);
        System.out.println(unset);
        ans[0]=set;
        ans[1]=unset;

    }
    static boolean checkBit(int num,int i){
        if((num>>i&1)==1)
            return true;
        return false;
    }
}
