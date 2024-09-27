package Scaler.Assignment27032023;

import java.util.Arrays;

public class CharacterChange {
    public static void main(String[] args) {
        String A="wfnfozvsrt";
        int B=4;
        char[] ch=A.toCharArray();
        int distinctCount=0,removeCount=0;
        int charRemoved=0;
        int frequency[]=new int[123];
        if(A.length()==1)
            System.out.println(1);
        else {
            for (int i = 0; i < ch.length; i++) {
                int num = ch[i];
                frequency[num]++;
            }
            Arrays.sort(frequency);
            Arrays.stream(frequency).forEach(System.out::print);
            System.out.println();
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != 0) {
                    distinctCount++;
                    removeCount += frequency[i];
                    charRemoved++;
                    if (removeCount > B) {
                        removeCount -= frequency[i];
                        charRemoved--;
                    }
                }
            }
        }
        System.out.println(distinctCount-charRemoved);
    }
}
