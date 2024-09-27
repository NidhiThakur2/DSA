package PracticePrograms.Arrays;

import java.util.Arrays;

public class TripletSumOr3Sum {
    public static void main(String[] args) {
        int A[]=new int []{1,2,4,3,6};
        int X=10;
        int n=A.length;
        int []ans=new int [3];
        Arrays.sort(A);
        for(int first=0;first<n-2;first++){
            if(first>0 && A[first]==A[first-1])
                continue;
            int second=first+1;
            int third=n-1;
            while(second<third) {
                int sum = A[first] + A[second] + A[third];
                if (sum < X) {
                    second++;
                } else if (sum > X) {
                    third--;
                } else {
                    ans[0] = A[first];
                    ans[1] = A[second];
                    ans[2] = A[third];
                    while (second < third && A[second] == A[second + 1])
                        second++;
                    while (second < third && A[third] == A[third - 1])
                        third--;
                    second++;
                    third--;
                }
            }
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
