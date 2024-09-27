package Scaler.DSA3.Stack1_06112023;

import java.util.ArrayList;

class IntNode {
    int val;
    IntNode next;

    IntNode(int val){
        this.val=val;
        this.next=null;

    }
}
class IntStack {
    int size=0;
    IntNode head=null;
    public void push(IntNode node){
        node.next=head;
        head=node;
        size++;

    }
    public IntNode pop(){
        IntNode ans=null;
        if(size!=0) {
            ans=head;
            head = head.next;
            size--;
        }
        return ans;
    }
    public IntNode peek(){
        IntNode ans=null;
        if(size!=0) {
            ans=head;
        }
        return ans;
    }

}


public class EvaluateExpression {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>();
        strList.add("2");
        strList.add("2");
        //strList.add("5");
        strList.add("/");
        //strList.add("+");
        int ans=executeExpression(strList);
        System.out.println(ans);

    }

    private static int executeExpression(ArrayList<String> strList) {
        IntStack stack=new IntStack();
        for(int i=0;i<strList.size();i++){
            if(!strList.get(i).equals("+") && !strList.get(i).equals("-") && !strList.get(i).equals("*") && !strList.get(i).equals("/")){
                Integer number=Integer.parseInt(strList.get(i));
                stack.push(new IntNode(number));
            }else{
                if(stack.size!=0)  {
                    int ans=0;
                    int op2=stack.pop().val;
                    int op1=stack.pop().val;
                    if(strList.get(i).equals("+")){
                        ans=op1+op2;
                        stack.push(new IntNode(ans));
                    }
                    if(strList.get(i).equals("-")){
                        ans=op1-op2;
                        stack.push(new IntNode(ans));
                    }
                    if(strList.get(i).equals("*")){
                        ans=op1*op2;
                        stack.push(new IntNode(ans));
                    }
                    if(strList.get(i).equals("/")){
                        ans=op1/op2;
                        stack.push(new IntNode(ans));
                    }
                }
            }
        }
        return stack.pop().val;
    }
}
