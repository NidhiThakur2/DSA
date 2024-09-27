package Scaler.DSA3.Stack2_08112023;

import java.util.ArrayList;
import java.util.Arrays;

class IntNode2 {
    int val;
    IntNode2 next;

    IntNode2(int val){
        this.val=val;
        this.next=null;

    }
}
class IntStack2 {
    int size=0;
    IntNode2 head=null;
    public void push(IntNode2 node){
        node.next=head;
        head=node;
        size++;

    }
    public IntNode2 pop(){
        IntNode2 ans=null;
        if(size!=0) {
            ans=head;
            head = head.next;
            size--;
        }
        return ans;
    }
    public IntNode2 peek(){
        IntNode2 ans=null;
        if(size!=0) {
            ans=head;
        }
        return ans;
    }

}


public class NearestSmallerElement {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();

        A.add(4);
        A.add(5);
        A.add(2);
        A.add(10);
        A.add(8);
        int[] ans=new int[A.size()];
        ans=getNearestSmallerElements(A);
        Arrays.stream(ans).forEach(System.out::println);

    }

    public static int[] getNearestSmallerElements(ArrayList<Integer> A) {
        IntStack2 stack=new IntStack2();
        int[] ans=new int[A.size()];
        for(int i=0;i<A.size();i++){
            while(stack.size!=0 && A.get(i)<=A.get(stack.peek().val))
                stack.pop();
            if(stack.size==0)
                ans[i]=-1;
            else {
              //  if (A.get(i) > stack.peek().val) {
                    ans[i]=stack.peek().val;


              //  }
            }
       //     stack.push(new IntNode2(A.get(i)));
            stack.push(new IntNode2(i));
        }
        return ans;
    }
    public  static int[] getNearestSmallerElementsRight(ArrayList<Integer> A) {
        IntStack2 stack=new IntStack2();
        int [] ans=new int[A.size()];
        for(int i=A.size()-1;i>=0;i--){
            while(stack.size!=0 && A.get(i)<=A.get(stack.peek().val))
                stack.pop();
            if(stack.size==0)
                ans[i]=-1;
            else {
             //   if (A.get(i) > A.get(stack.peek().val)) {
                    ans[i]=stack.peek().val;
                    //  ans.add();

            //    }
            }
            stack.push(new IntNode2(i));
        }
        return ans;
    }

    public  static ArrayList<Integer> getNearestGreaterElementsLeft(ArrayList<Integer> A) {
        IntStack2 stack=new IntStack2();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<=A.size()-1;i++){
            while(stack.size!=0 && A.get(i)>=A.get(stack.peek().val))
                stack.pop();
            if(stack.size==0)
                ans.add(-1);
            else {
              //  if (A.get(i) < A.get(stack.peek().val)) {
                    ans.add(stack.peek().val);
                    //  ans.add();

              //  }
            }
            stack.push(new IntNode2(i));
        }
        return ans;
    }

    public  static ArrayList<Integer> getNearestGreaterElementsRight(ArrayList<Integer> A) {
        IntStack2 stack=new IntStack2();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=A.size()-1;i>=0;i--){
            while(stack.size!=0 && A.get(i)>=A.get(stack.peek().val))
                stack.pop();
            if(stack.size==0)
                ans.add(-1);
            else {
               // if (A.get(i) < A.get(stack.peek().val)) {
                    ans.add(stack.peek().val);
                    //  ans.add();

              //  }
            }
            stack.push(new IntNode2(i));
        }
        return ans;
    }

}
