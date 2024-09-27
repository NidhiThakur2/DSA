package Scaler.Contest;

import java.util.HashMap;
import java.util.Set;

public class KingPalindroms {
    public static void main(String[] args) {
        String A="cgfikdjbagejbedaigfdicebkbadaahddddjgadebkjhkkbjfgkfahfkcekkbecadeddjakkdchjc";
        int maxOddFreqCount=0;
        int length=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            hm.put(A.charAt(i),hm.getOrDefault(A.charAt(i),0)+1);
        }
        for (Character key:hm.keySet()) {
            int value=hm.get(key);
            if(value%2!=0){
                int even=2*(value/2);
                length=length+even;
                value=value%2;
                if(value>maxOddFreqCount)
                    maxOddFreqCount=value;
            }else{
                length=length+value;
            }
        }
        length=length+maxOddFreqCount;
        System.out.println(hm);
        System.out.println(length);
    }

}
