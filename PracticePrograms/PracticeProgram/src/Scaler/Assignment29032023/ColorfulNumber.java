package Scaler.Assignment29032023;

import java.util.*;

public class ColorfulNumber {
    public static void main(String[] args) {
        int A=326;
        HashSet<Integer> numSet=new HashSet<Integer>();
        while(A>0){
            int r=A%10;
            if(!numSet.contains(r))
               numSet.add(r);
            else {
                System.out.println(0);
                break;
            }
            A=A/10;
        }
        Integer []numSetArray=numSet.toArray(new Integer[numSet.size()]);
        Set<Integer> prodFrequency=new HashSet<Integer>();
        for(int i=0;i<numSetArray.length;i++){
            for(int j=i+1;j<numSetArray.length;j++){
                //System.out.println(numSetArray[i] +"*"+numSetArray[j]);
                int prod=numSetArray[i]*numSetArray[j];
                if(prodFrequency.contains(prod) || numSet.contains(prod)){
                    prodFrequency.add(0);
                    break;
                }else{
                    prodFrequency.add(prod);
                }
            }
        }
        prodFrequency.stream().forEach(System.out::println);
        if(prodFrequency.contains(0))
            System.out.println(0);
        else
            System.out.println(1);
    }
}

