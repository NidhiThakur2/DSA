package Scaler.Assignment220223;

public class SecondlargestElement {
    public static void main(String[] args) {
        //int[] A={13, 7, 16, 18, 14, 17, 18, 8, 10};
        //int[] A={11, 15, 19};
        //int[] A={10, 10, 9, 8, 1};
        //int[] A={2,2,2};
        int[] A={2};
        int max=A[0];
        int secondMax,secondMaxChange=0;
        if(A.length==1)
            secondMax=-1;
        else
            secondMax=Integer.MIN_VALUE;
        for(int i=1;i<A.length;i++) {
            if(A[i]>max){
                secondMax=max;
                max = A[i];
                secondMaxChange++;
            }else{
                if(A[i]>secondMax && A[i]!=max){
                    secondMax=A[i];
                    secondMaxChange++;
                }
            }
        }
       /* if(secondMaxChange!=0 || secondMax==max)
            System.out.println(secondMax);
        else
            System.out.println(-1);*/
        if(secondMax==Integer.MIN_VALUE)
            System.out.println(-1);
        else
            System.out.println(secondMax);
    }
}
