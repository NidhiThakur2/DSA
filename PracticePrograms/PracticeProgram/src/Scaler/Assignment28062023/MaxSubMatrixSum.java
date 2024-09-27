package Scaler.Assignment28062023;

import java.util.ArrayList;

public class MaxSubMatrixSum {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mat=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> t=new ArrayList<>();
        t.add(1);
        t.add(2);
        t.add(3);
        mat.add(t);
        t=new ArrayList<>();
        t.add(4);
        t.add(5);
        t.add(6);
        mat.add(t);
        t=new ArrayList<>();
        t.add(7);
        t.add(8);
        t.add(9);
        mat.add(t);
        ArrayList<ArrayList<Long>> pfs=pfSumArray(mat);
        Long max=pfs.get(0).get(0);
        for(int i=0;i<pfs.size();i++){
            for(int j=0;j<pfs.get(0).size();j++){
                Long sum=findSum(i,j,pfs);
                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println(max);
    }

    private static Long findSum(int i, int j, ArrayList<ArrayList<Long>> pfs) {
        int n=pfs.size();
        int m=pfs.get(0).size();
        Long sum=pfs.get(n-1).get(m-1);
        if(j>0){
            sum=sum-pfs.get(n-1).get(j-1);
        }
        if(i>0){
            sum=sum-pfs.get(i-1).get(m-1);
        }
        if(i>0 && j>0){
            sum=sum+pfs.get(i-1).get(j-1);
        }
        return sum;
    }

    private static ArrayList<ArrayList<Long>> pfSumArray(ArrayList<ArrayList<Integer>> mat){
        ArrayList<ArrayList<Long>> pfs=new ArrayList<ArrayList<Long>>();
        //Column Wise Sum
        for(int i=0;i<mat.size();i++){
            ArrayList<Long> temp=new ArrayList<>();
            for(int j=0;j<mat.get(0).size();j++){
                if(j==0) {
                    temp.add(0l+mat.get(i).get(j));
                }else{
                    Long num=temp.get(j-1)+mat.get(i).get(j);
                    temp.add(num);
                }
            }
            pfs.add(temp);
        }
        //Row Wise Sum
        for(int j=0;j<pfs.get(0).size();j++){
            Long sum=0l;
            for(int i=0;i<pfs.size();i++){
                if(i==0) {
                    sum=pfs.get(i).get(j);
                }else{
                    sum=pfs.get(i-1).get(j)+pfs.get(i).get(j);

                }
                ArrayList<Long> temp=pfs.get(i);
                temp.set(j,sum);
                pfs.set(i,temp);
            }

        }
        for(int i=0;i<pfs.size();i++){
            for(int j=0;j<pfs.get(0).size();j++){
                System.out.print(pfs.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
        return pfs;
    }
}
