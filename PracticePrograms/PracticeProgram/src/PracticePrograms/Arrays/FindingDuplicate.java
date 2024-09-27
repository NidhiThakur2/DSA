package PracticePrograms.Arrays;

import java.util.ArrayList;
import java.util.Stack;

public class FindingDuplicate {
    public static void main(String[] args) {
        int []A=new int[]{3,4,1,2,4,3};
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> stack=new Stack<Integer>();
        for(int i=0;i<A.length;i++){
            if(stack.isEmpty()) {
                stack.push(A[i]);
                continue;
            }
            if(A[i]==stack.peek()){
                ans.add(stack.peek());
                stack.push(A[i]);
            }else if(A[i]>stack.peek()){
                int temp=stack.pop();
                if(!stack.isEmpty() && A[i]==stack.peek()){
                    ans.add(stack.peek());
                }
                stack.push(A[i]);
                stack.push(temp);
            }else{
                stack.push(A[i]);
            }

        }
        ans.stream().forEach(System.out::println);
    }
}
