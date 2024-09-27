package Scaler.Assignment27022023;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeaderArray {
    public static void main(String[] args) {
        List<Integer> A=new ArrayList<>();
        A.add(16);
        A.add(17);
        A.add(4);
        A.add(3);
        A.add(5);
        A.add(2);
        int i=A.size()-1;
        int leader=-1;
        List<Integer> leaderList=new ArrayList<>();
        while(i>=0){
            if(i==A.size()-1){
                leader=A.get(i);
                leaderList.add(leader);
            }else{
                if (A.get(i)>leader) {
                    leader=A.get(i);
                    leaderList.add(leader);
                }
            }
            i--;
        }
        leaderList.stream().forEach(System.out::println);

    }
}
