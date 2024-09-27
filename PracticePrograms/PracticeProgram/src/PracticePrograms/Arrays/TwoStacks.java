package PracticePrograms.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class TwoStacks {
    int size;
    int[] arr;
    int top1, top2;

    TwoStacks(int size) {
        this.size=size;
        arr = new int[size];
        top1 = size / 2;
        top2 = size / 2 + 1;
    }
    void push1(int num){
        if(top1>=0){
            arr[top1]=num;
            top1--;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    void push2(int num){
        if(top2<=size-1){
            arr[top2]=num;
            top2++;
        }else{
            System.out.println("Stack Overflow");
        }
    }
    int pop1(){

        if(top1<size/2){
            top1++;
            int num=arr[top1];
            return num;
        }else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2(){

        if(top2>size/2+1){
            top2--;
            int num=arr[top2];
            return num;
        }else{
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
}
class TwoStacksImplementation{
    public static void main(String[] args) {
        TwoStacks ts=new TwoStacks(5);
        ts.push1(3);
        ts.push1(2);
        ts.push2(4);
        ts.push2(8);
        ts.push1(10);
        int []a=ts.arr;
        Arrays.stream(a).forEach(System.out::print);
        System.out.println(ts.pop1());
        System.out.println(ts.pop1());
        System.out.println(ts.pop2());
        System.out.println(ts.pop2());
        System.out.println(ts.pop2());



    }


}
