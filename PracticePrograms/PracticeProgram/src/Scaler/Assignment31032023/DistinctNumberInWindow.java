package Scaler.Assignment31032023;

import java.util.*;

public class DistinctNumberInWindow {
    public static void main(String[] args) {
        int []A={1, 1, 2, 2};
        int B=1;
        int s=0,e=B-1;
        int []result=new int[(A.length-B)+1];
        Map<Integer,Integer> elements=new HashMap<Integer,Integer>();
        int k=0;
        for(int i=s;i<=e;i++){
            elements.put(A[i],elements.getOrDefault(A[i],0)+1);
        }
        while(e<A.length){
            result[k]=elements.size();
            s++;
            e++;
            elements.put(A[s-1], elements.get(A[s-1])-1);
            if(e<=A.length-1)
                elements.put(A[e],elements.getOrDefault(A[e],0)+1);
            if(elements.get(A[s-1])==0)
                elements.remove(A[s-1]);
            k++;
        }
        Arrays.stream(result).forEach(System.out::println);
    }
}
