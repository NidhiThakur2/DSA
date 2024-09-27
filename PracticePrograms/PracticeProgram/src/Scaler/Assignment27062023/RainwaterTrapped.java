package Scaler.Assignment27062023;

import java.util.ArrayList;

public class RainwaterTrapped {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(0);
        A.add(1);
        A.add(0);
        A.add(2);
        int lMax=A.get(0);
        int rMax=A.get(A.size()-1);
        int ans=0,left=1,right=A.size()-2;
        for(int i=1;i<A.size()-1;i++){
            if(lMax<rMax){
                if(A.get(left)<lMax){
                    int water=lMax-A.get(left);
                    ans+=water;

                }else
                    lMax=A.get(left);
                left++;
            }else{
                if(A.get(right)<rMax){
                    int water=rMax-A.get(right);
                    ans+=water;

                }else{
                    rMax=A.get(right);
                }
                right--;
            }
        }
        System.out.println(ans);
    }
}
