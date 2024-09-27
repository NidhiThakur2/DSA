package InterviewBits;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNonNegativeSubArray {
    public static void main(String[] args) {
        //int A[]={2,3,4,2,-3,-2,34,8,9,67};
        //int A[]={1,2,5,-7,2,5};
        //int A[]={10, -1, 2, 3,100, -4, 100};
        ArrayList<Integer> A=new ArrayList<>();
        A.add(0);
        A.add(0);
        A.add(-1);
        A.add(0);

        ArrayList<Integer> result=new ArrayList<>();
        long sum=0,maxSum=sum;
        int i=0,j=0;
        int startIndex=-1,endIndex=-1;
        while(i<A.size()){
           for(j=i;j<=A.size()-1;j++){
                if(A.get(j)<0){
                    i=j;
                    sum=0;
                    break;
                }
                    sum = sum + A.get(j);
                   if(sum==maxSum){
                       if((j-i)>(endIndex-startIndex)){
                            startIndex=i;
                            endIndex=j;
                       }
                   }
                    if (sum > maxSum) {
                        maxSum = sum;
                        startIndex = i;
                        endIndex = j;
                    }


            }
           if(j==A.size()) {
              break;
           }
            i++;
          }
        if(startIndex!=-1 && endIndex!=-1){
            for(int k=startIndex;k<=endIndex;k++){
                System.out.println(A.get(k));
                result.add(A.get(k));
            }
        }


    }
}
