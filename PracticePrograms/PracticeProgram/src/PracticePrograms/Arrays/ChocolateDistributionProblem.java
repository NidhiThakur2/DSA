package PracticePrograms.Arrays;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int []arr=new int []{3, 4, 1, 9, 56, 7, 9, 12};
        int m=5, n=arr.length;
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        if(arr.length<m)
            System.out.println(-1);
        else if(arr.length==0 || m==0)
            System.out.println(0);
        else {
            for (int i = 0; i < arr.length; i++) {
                int nextWindow = i + m - 1;
                if(nextWindow>=arr.length)
                    break;
                int diff = arr[nextWindow] - arr[i];
                minDiff = Math.min(minDiff, diff);
            }
            System.out.println(minDiff);
        }

    }
}
