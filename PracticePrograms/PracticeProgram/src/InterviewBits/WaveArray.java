package InterviewBits;

import java.util.ArrayList;
import java.util.Collections;

public class WaveArray {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i+=2){
            int temp=A.get(i);
            A.set(i,A.get(i+1));
            A.set(i+1,temp);
        }
        A.stream().forEach(System.out::println);
    }
}
