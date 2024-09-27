package Scaler.Assignment20032023;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class NobleInteger {
    public static void main(String[] args) {
        int A[]={-1, -2, 0, 0, 0, -3};
        Arrays.sort(A);
        reverse(A);
        Arrays.stream(A).forEach(System.out::println);
        int ans=0,count=0;
        if(A[0]==0)
            ans=1;
        for(int i=1;i<=A.length-1;i++){
            if(A[i]!=A[i-1]){
                count=i;
                if(count==A[i])
                    ans++;
            }

        }
        if(ans==0)
            System.out.println(-1);
        else
            System.out.println(ans);

    }

    private static void reverse(int[] A) {
        int i=0,j=A.length-1;
        while(i<j){
            int temp=A[i];
            A[i]=A[j];
            A[j]=temp;
            i++;
            j--;
        }
    }


}
