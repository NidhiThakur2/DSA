package Scaler.Assignment20032023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LargestInteger {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<Integer>();
        A.add(3);
        A.add(89);
        A.add(98);
        A.add(32);
        A.add(10);
        A.add(8);
        ArrayList<Integer> B=new ArrayList<Integer>();
        for(int i=0;i<A.size();i++)
            B.add(A.get(i));
        Collections.sort(B,new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                String str=String.valueOf(o1)+String.valueOf(o2);
                String str1=String.valueOf(o2)+String.valueOf(o1);
                return str.compareTo(str1);
            }
        });
        String result="";
        int count=0;
        StringBuilder sb=new StringBuilder(result);
        for(int i=B.size()-1;i>=0;i--) {
            if(B.get(i)==0)
                count++;
                sb.append(B.get(i));
        }
        if(count==A.size())
            System.out.println("0");
        else
            System.out.println(result);
    }
}

