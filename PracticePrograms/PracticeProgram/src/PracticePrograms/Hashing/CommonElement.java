package PracticePrograms.Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommonElement {
    public static void main(String[] args) {
        int A[] = {2, 1, 4,4, 10};
        int B[] = {3, 6, 2,4,4,4, 10, 10};

        Map<Integer, Integer> frequencyMapA = new HashMap<>();
        Map<Integer, Integer> frequencyMapB = new HashMap<>();
        for(int i=0;i<=A.length-1;i++){
            int countA=frequencyMapA.getOrDefault(A[i],0);
            countA+=1;
            frequencyMapA.put(A[i],countA);
        }
        for(int i=0;i<=B.length-1;i++){
            int countB=frequencyMapB.getOrDefault(B[i],0);
            countB+=1;
            frequencyMapB.put(B[i],countB);
        }
        for (Map.Entry<Integer,Integer> entryA:frequencyMapA.entrySet()) {
            int elementA= entryA.getKey();
            int frequencyA=entryA.getValue();
            int frequencyB=frequencyMapB.getOrDefault(elementA,-1);
            int frequency;
            if(frequencyB!=-1) {
                if (frequencyA < frequencyB)
                    frequency = frequencyA;
                else
                    frequency = frequencyB;

                for (int k = 0; k <= frequency - 1; k++) {
                    System.out.println(elementA);
                }

            }
        }
        //Arrays.stream(result).forEach(System.out::println);

    }
}
