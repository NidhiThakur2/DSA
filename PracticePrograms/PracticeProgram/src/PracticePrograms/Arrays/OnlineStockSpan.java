package PracticePrograms.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        int A[]=new int[]{100, 80, 60, 70, 60, 75, 85};
        Stack<Integer[]> stack=new Stack<>();
        int []ans=new int[A.length];
        for(int i=0;i<A.length;i++){
            int span=1;
            while(!stack.isEmpty() && stack.peek()[0]<A[i])
                span=span+stack.pop()[1];
            stack.push(new Integer[]{A[i],span});
            ans[i]=span;
        }
        Arrays.stream(ans).forEach(System.out::println);
    }
}
