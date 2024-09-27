package Scaler.DSA3.Queue_10112023;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNUmberOptimized {
    public static void main(String[] args) {
        int A=3;
        int count=2;
        Queue<String> q =new LinkedList<>();
        q.add("11");
        q.add("22");
        if(A==1){
            System.out.println(q.peek());
            return;
        }
        if(A==2){
            q.remove();
            System.out.println(q.peek());
            return;
        }
        while(true){
            String front=q.peek();
            q.remove();
            count++;
            if(count==A){
                System.out.println(generatePalindrom(front,"11"));
                return;
            }
            q.add(generatePalindrom(front,"11"));
            count++;
            if(count==A){
                System.out.println(generatePalindrom(front,"22"));
                return;
            }
            q.add(generatePalindrom(front,"22"));
        }
    }

    private static String generatePalindrom(String front, String s) {
        int len=front.length();
        return front.substring(0,len/2)+s+front.substring(len/2,len);
    }
}
