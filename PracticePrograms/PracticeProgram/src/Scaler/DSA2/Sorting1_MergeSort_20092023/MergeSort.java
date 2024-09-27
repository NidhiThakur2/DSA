package Scaler.DSA2.Sorting1_MergeSort_20092023;

import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        A.add(1);
        A.add(3);
        A.add(5);
        A.add(-1);
        A.add(11);
        A.add(12);
        int start=0,end=A.size()-1;
      //  int mid=(start+end)/2;
        //merge(A,0,2,A.size());
        mergeSort(A,start,end);
        A.stream().forEach(System.out::println);
    }
    static void merge(ArrayList<Integer> A,int l,int y,int r){
        //ArrayList<Integer> C=new ArrayList<>();
        int i=l,j=y+1;
        while(i<=y && j<=r){

                if(A.get(i)<A.get(j)) {
                    //C.add(A.get(i));
                    A.set(i,A.get(i));
                    i++;
                }else if(A.get(i)==A.get(j)){
                  //  C.add(A.get(i));
                    A.set(i,A.get(i));
                    i++;
                    j++;
                }
                else{
                   // C.add(A.get(j));
                    A.set(i,A.get(j));
                    j++;
                }
        }
        while(i<y){
           // C.add(A.get(i));
            A.set(i,A.get(i));
            i++;
        }
        while(j<r){
            //C.add(A.get(j));
            A.set(i,A.get(j));
            j++;
        }

     // C.stream().forEach(System.out::println);

    }

    static void mergeSort(ArrayList<Integer> A, int start, int end){
        if(start==end)
            return ;
        int mid=(start+end)/2;
        mergeSort(A,start,mid);
        mergeSort(A,mid+1,end);
        merge(A,start,mid,end);
    }
}
