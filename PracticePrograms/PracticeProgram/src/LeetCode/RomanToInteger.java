package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        Map<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        String roman="IV";
        int sum=0;
        for(int i=0;i<roman.length();){
            if(i==roman.length()-1){
                sum+=hm.get(roman.charAt(i));
                i++;
            }
            else if( (roman.charAt(i)=='I' && (roman.charAt(i+1)=='V' || roman.charAt(i+1)=='X')) ||
                    (roman.charAt(i)=='X' && (roman.charAt(i+1)=='L' || roman.charAt(i+1)=='C')) ||
                    (roman.charAt(i)=='C' && (roman.charAt(i+1)=='D' || roman.charAt(i+1)=='M'))){
                sum=sum+(hm.get(roman.charAt(i+1)) - hm.get(roman.charAt(i)));
                i+=2;

            }else{
                sum+=hm.get(roman.charAt(i));
                i++;
            }
        }
        System.out.println(sum);
    }
}
