package Scaler.MockInterview.DSA;

import java.util.Stack;

public class LargestRactangleInHistogram {
    public static void main(String[] args) {
        int[] A=new int[]{2,1,5,6,2,3};
        int ans=getLargestRectangle(A);
        System.out.println(ans);
    }

    private static int getLargestRectangle(int[] a) {
        int maxArea=0;
        int[] smallerLeft=getSmallerLeftIndexes(a);
        int[] smallerRight=getSmallerRightIndexes(a);
        for(int i=0;i<=a.length-1;i++){
            int h=a[i];
            int w=smallerRight[i]-smallerLeft[i]+1;
            int area=h*w;
            if(maxArea<area)
                maxArea=area;
        }
        return maxArea;
    }

    private static int[] getSmallerRightIndexes(int[] a) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            if(!stack.isEmpty() && a[i]<=a[stack.peek()])
                stack.pop();
            else{
                if(stack.isEmpty())
                    ans[i]=-1;
                else{
                    ans[i]=stack.peek();
                }
            }
            stack.push(i);
        }
        return ans;
    }

    private static int[] getSmallerLeftIndexes(int[] a) {
        Stack<Integer> stack=new Stack<>();
        int ans[]=new int[a.length];
        for(int i=0;i<=a.length-1;i++){
            if(!stack.isEmpty() && a[i]<=a[stack.peek()])
                stack.pop();
            else{
                if(stack.isEmpty())
                    ans[i]=-1;
                else{
                    ans[i]=stack.peek();
                }
            }
            stack.push(i);
        }
        return ans;
    }
}
