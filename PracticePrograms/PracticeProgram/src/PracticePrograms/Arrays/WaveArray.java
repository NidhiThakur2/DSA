package PracticePrograms.Arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[]=new int[]{1,2,3,4,5};
        int n=a.length;
        for(int i=1;i<=n-1;i+=2){
            int temp=a[i-1];
            a[i-1]=a[i];
            a[i]=temp;
        }
        Arrays.stream(a).forEach(System.out::println);
    }
}
