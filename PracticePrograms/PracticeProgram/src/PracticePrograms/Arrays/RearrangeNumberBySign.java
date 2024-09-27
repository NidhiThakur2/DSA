package PracticePrograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeNumberBySign {
    public static void main(String[] args) {
        int []A=new int[]{1,2,-4,-5};
        int posIndex=0;
        int negIndex=1;
        int []ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            if(A[i]>0) {
                ans[posIndex] = A[i];
                posIndex += 2;
            }
            if(A[i]<0){
                ans[negIndex]=A[i];
                negIndex += 2;
            }
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
