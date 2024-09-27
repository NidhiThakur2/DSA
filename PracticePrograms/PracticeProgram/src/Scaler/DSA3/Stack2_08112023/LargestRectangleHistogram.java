package Scaler.DSA3.Stack2_08112023;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Arrays;

public class LargestRectangleHistogram {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(90);
        A.add(58);
        A.add(69);
        A.add(70);
        A.add(82);
        A.add(100);
        A.add(13);
        A.add(57);
        A.add(47);
        A.add(18);
     //   A.add(1);
        int ans=getLargestArea(A);
        System.out.println(ans);
    }

    public static int[] getNearestSmallerElementsLeft(ArrayList<Integer> A) {
       Stack<Integer> stack=new Stack<>();
        int[] ans=new int[A.size()];
        for(int i=0;i<A.size();i++){
            while(!stack.isEmpty() && A.get(i)<=A.get(stack.peek()))
                stack.pop();
            if(stack.isEmpty())
                ans[i]=-1;
            else {
                ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    public  static int[] getNearestSmallerElementsRight(ArrayList<Integer> A) {
        Stack<Integer> stack=new Stack<>();
        int [] ans=new int[A.size()];
        for(int i=A.size()-1;i>=0;i--){
            while(!stack.isEmpty() && A.get(i)<=A.get(stack.peek()))
                stack.pop();
            if(stack.isEmpty())
                ans[i]=A.size();
            else {
                 ans[i]=stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    private static int getLargestArea(ArrayList<Integer> A) {
        int[] smallerLeft=getNearestSmallerElementsLeft(A);
        int[] smallerRight=getNearestSmallerElementsRight(A);
       // Arrays.stream(smallerLeft).forEach(System.out::print);
      //  System.out.println();
      //  Arrays.stream(smallerRight).forEach(System.out::print);
        int maxArea=0;
        for(int i=0;i<A.size();i++){
            int h=A.get(i);
            int w=smallerRight[i]-smallerLeft[i]-1;
            int area=h*w;
            if(area>maxArea)
                maxArea=area;
        }
        return maxArea;
    }
}
