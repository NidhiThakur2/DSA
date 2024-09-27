package Scaler.MockInterview.DSA;


import java.util.Stack;

public class RainWaterTrappedStack {
    public static void main(String[] args) {
        int []A=new int[]{0, 1, 0, 2};
        Stack<Integer> stack=new Stack<>();
        int n=A.length;
        int trappedWater=0;
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && A[i]>A[stack.peek()]){
                int topIndex=stack.pop();
                if(stack.isEmpty())
                    break;
                int width=i-stack.peek()-1;
                int height=Integer.min(A[i],A[stack.peek()])-A[topIndex];
                trappedWater+=(width*height);
            }
            stack.push(i);
        }
        System.out.println(trappedWater);
    }
}
