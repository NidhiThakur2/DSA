package PracticePrograms.Arrays;

public class SubArrayExceedingSum {
    public static void main(String[] args) {
        Integer[] array=new Integer[]{1,2,3,4,5};
        int s=12;
        int result=subArrayExceedsSum(array,s);
        System.out.println(result);
    }

    private static int subArrayExceedsSum(Integer[] array, int s) {
        int n=array.length;
        int minInt=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            int sum=array[i];
            boolean found=false;
            for(int j=i+1;j<n;j++){
                if(sum>=s){
                    int len=j-i;
                    minInt=Math.min(minInt,len);
                    found=true;
                    break;
                }
                sum+=array[j];
            }
            if(!found){
                if(sum>=s) {
                    int len = n - i;
                    minInt=Math.min(minInt,len);
                }
            }
        }
        if(minInt==Integer.MAX_VALUE)
            minInt=0;
        return minInt;
    }
}
