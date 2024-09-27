package PracticePrograms.Arrays;

public class RowWithMax1s {
    public static void main(String[] args) {
        int [][]A=new int [][]{{0, 1}, {0, 1}};
        int minZeroCount=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<A.length;i++){
            if(A[i][0]==1) {
                minZeroCount=0;
                ans=i;
                break;
            }else{
                int j=0,count=0;
                while(j<A[0].length && A[i][j]!=1){
                    count++;
                    j++;
                }
                if(count<minZeroCount) {
                    minZeroCount = count;
                    ans=i;
                }
            }
        }
        System.out.println(ans);
    }
}
