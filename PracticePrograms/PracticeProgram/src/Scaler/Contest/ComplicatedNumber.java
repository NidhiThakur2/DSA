package Scaler.Contest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ConcurrentMap;

public class ComplicatedNumber {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(6);
        A.add(6);
        A.add(3);
        A.add(4);
        A.add(3);
        ArrayList<Integer> B=new ArrayList<>();
        for(int i=0;i<=A.size()-1;i++){
            B.add(i);
        }
        Collections.sort(B, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1==o2)
                    return 0;
                if(o2>o1)
                    return 1;
                else
                    return -1;
            }
        });
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=A.size()-1;i>=2;i--){
            int index=A.indexOf(B.get(i));
            result.add(index,B.get(i));

        }
        A.stream().forEach(System.out::println);
    }
}
