package PracticePrograms.Arrays;

import java.util.HashSet;

public class SmallestPossibleMissingNumber {
    public static void main(String[] args) {
        int []A=new int []{0,-10,2,3,-20};
        int max=Integer.MIN_VALUE;
        int ans=-1;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<A.length;i++){
            if(max<A[i])
                max=A[i];
            if(A[i]>0)
                hs.add(A[i]);
        }
        for(int i=1;i<=max;i++){
            if(!hs.contains(i)) {
                ans=i;
                break;
            }
        }
        if(ans==-1)
            ans=max+1;
        System.out.println("HashSet :"+ans);
        ans=usingBooleanArray(A);
        System.out.println("Boolean Array"+ans);
        ans=usingConstantSpace(A);
        System.out.println("Constant Space O(1)"+ans);
    }

    private static int usingConstantSpace(int[] a) {
        //Check if 1 exist in the array
        // and mark all irrelavant numbers (-Ve and greater than length of Array) as 1
        boolean contailsOne=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==1)
                contailsOne=true;
            if(a[i]<0 && a[i]>a.length)
                a[i]=1;
        }
        if(!contailsOne)
            return 1;
        //Now the array have all the elements which are in range of 1 to N(length of the array)
        // will mark all the A[A[i]]=-A[i] to mark the element index as negative.
        //will use 0 index to mark the Nth element if Nth element is present in the array because we don't have Nth index
        for(int i=0;i<a.length;i++){
            int value=a[i];
            if(value==a.length){
                a[0]=-Math.abs(a[0]);
            }else{
                a[value]=-Math.abs(a[value]);
            }
        }
        //check from i=1 to N if array has all the negative numbers
        // which means there is no element missing in the array from 1 to N-1
        //for Nth element check if a[0]==-ve then Nth element is also present and we return N+1 as first missing number
        for(int i=1;i<=a.length;i++){
            if(i==a.length){
                if(a[0]>0)
                    return a.length;
            }else{
                if(a[i]>0)
                    return i;
            }
        }
          return a.length+1;
    }

    private static int usingBooleanArray(int[] a) {
        boolean bool[]=new boolean [a.length+1];
        for(int i=0;i<a.length;i++){
            int val=a[i];
            if(val<=a.length && val>0)
                bool[val]=true;
        }
        for(int i=1;i<bool.length;i++){
            if(!bool[i])
                return i;
        }
        return bool.length;
    }


}
