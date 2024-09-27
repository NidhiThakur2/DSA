package LeetCode;

import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        String rNum="LVIII";
        int sum=0;
        for(int i=0;i<rNum.length();){
            if(i==rNum.length()-1) {
                sum=sum+hm.get(rNum.charAt(i));
                i++;
            }
            else if((rNum.charAt(i)=='I' && (rNum.charAt(i+1)=='V' || rNum.charAt(i+1)=='X')) ||
                    (rNum.charAt(i)=='X' && (rNum.charAt(i+1)=='L' || rNum.charAt(i+1)=='C')) ||
                    (rNum.charAt(i)=='C' && (rNum.charAt(i+1)=='D' || rNum.charAt(i+1)=='M'))){
                sum=sum+(hm.get(rNum.charAt(i+1))-hm.get(rNum.charAt(i)));
                i+=2;
            }else{
                sum=sum+hm.get(rNum.charAt(i));
                i++;
            }




        }
        System.out.println(sum);
        StringBuilder sb=new StringBuilder();
        sb.append(1);
        sb.append(2);

        System.out.println(sb.reverse().toString().equals("21"));
    }
}

