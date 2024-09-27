package Scaler.Contest;

import java.util.HashSet;

public class AliceAndRepeatingCHaracter {
    public static void main(String[] args) {
        String A="abcd";
        HashSet<Character> hs=new HashSet<Character>();
        for(int i=0;i<A.length();i++){
            if(!hs.contains(A.charAt(i)))
                hs.add(A.charAt(i));
            else {
                System.out.println(A.charAt(i));
                break;
            }

        }
        if(hs.size()==A.length())
            System.out.println("");
    }
}
