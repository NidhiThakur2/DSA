package PracticePrograms.Arrays;

public class MinimumNumberOfJumps {
    public static void main(String[] args) {
        int []A=new int []{1, 4, 3, 2, 6, 7};
        int ans=minJump(A,0,A.length-1);
        System.out.println(ans);
    }

    private static int minJump(int[] a, int l, int h) {
        if(l==h)
            return 0;
        if(a[l]==0)
            return Integer.MAX_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=l+1;i<=h && i<=l+a[l];i++){
            int jump=minJump(a,i,h);
            if(jump!=Integer.MAX_VALUE && jump+1<min)
                min=jump+1;
        }
        return min;
    }
}
