package Scaler.DSA2.Sorting3_Coparator_25092023;

import java.util.Arrays;
import java.util.Comparator;

public class ClosestPointToOrigin {
    public static void main(String[] args) {
        int[][] A=new int[][]{{1,-1},{2,-1}};
        Comparator<int[]> compare=new Comparator<int[]>() {
            @Override
            public int compare(int[] p1, int[] p2) {
                int p1Euclidean=findEuclidean(p1);
                int p2Euclidean=findEuclidean(p2);
                if(p1Euclidean<p2Euclidean)
                    return -1;
                else if (p1Euclidean>p2Euclidean)
                    return 1;
                else
                    return 0;
            }
        };
        Arrays.sort(A,compare);
        Arrays.stream(A).forEach(System.out::println);
        int B=1;
        int result[][]=new int[A[0].length][A.length];
        for(int i=0;i<B;i++){
            result[i][0]=A[i][0];
            result[i][1]=A[i][1];
        }
        for(int i=0;i<B;i++) {
            Arrays.stream(A[i]).forEach(System.out::print);
            System.out.println();
        }

    }
    private static int findEuclidean(int[] p){
        int x1=p[0];
        int y1=p[1];
     //   int x2=0,y2=0;
      //  int xDiff=x1-x2;
     //   int yDiff=y1-y2;
        int ans=findSqrt((x1*x1)+(y1*y1));
        return ans;
    }
    private static int findSqrt(int A){
        int ans=1,i=1;
        while(i*i<=A){
            ans=i;
            i++;

        }
        return ans;
    }
}
