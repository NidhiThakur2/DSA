package Scaler.Contest;

import java.util.HashMap;

public class LittlePonneyAndPalindrom {
    public static void main(String[] args) {
        String A = "aabbbbc";
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        int length = A.length();
        int count = 0;
        for (int i = 0; i < A.length(); i++) {
            hm.put(A.charAt(i), hm.getOrDefault(A.charAt(i), 0) + 1);
        }
        if (hm.size() == 1)
            System.out.println(1);
        else {
            for (int i = 0; i < A.length(); i++) {
                if (length % 2 == 0) {
                    if (hm.get(A.charAt(i)) % 2 != 0) {
                        System.out.println(0);
                        break;
                    } else {
                        if (hm.get(A.charAt(i)) % 2 != 0) {
                            if (count >= 1) {
                                System.out.println(0);
                                break;
                            } else
                                count++;

                        }
                    }
                }
            }

        }
        System.out.println(1);

    }
}
