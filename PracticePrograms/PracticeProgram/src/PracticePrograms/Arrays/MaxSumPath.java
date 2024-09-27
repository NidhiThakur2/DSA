package PracticePrograms.Arrays;

import java.util.HashSet;

public class MaxSumPath {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 3, 7, 10, 12, 15, 30, 34};
        int[] a2 = new int[]{1, 5, 7, 8, 10, 15, 16, 19};
        int sum1=0,sum2=0;
        int i=0,j=0;
        int result=0;
        while(i<a1.length && j<a2.length){
            if(a1[i]<a2[j]) {
                sum1 += a1[i];
                i++;
            }else if(a1[i]>a2[j]){
                sum2+= a2[j];
                j++;
            }else{
                result+=Math.max(sum1,sum2);
                sum1=sum2=0;
                while(a1[i]==a2[j] && i<a1.length && j<a2.length){
                    result+=a1[i];
                    i++;
                    j++;
                }
            }
        }
        while(i<a1.length){
            sum1+=a1[i];
            i++;
        }
        while(j<a2.length){
            sum2+=a2[j];
            j++;
        }
        result+=Math.max(sum1,sum2);
        System.out.println(result);
    }
}
