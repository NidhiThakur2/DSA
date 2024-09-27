package Scaler.Assignment28062023;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SumOfAllSubMatrices {
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
        ArrayList<ArrayList<Integer>> pfs=pfSumArray(mat);
    }
    private static ArrayList<ArrayList<Integer>> pfSumArray(ArrayList<ArrayList<Integer>> mat){
        ArrayList<ArrayList<Integer>> pfs=new ArrayList<ArrayList<Integer>>();
        //Column Wise Sum
        for(int i=0;i<mat.size();i++){
            ArrayList<Integer> temp=new ArrayList<>();
            for(int j=0;j<mat.get(0).size();j++){
                if(j==0) {
                    temp.add(mat.get(i).get(j));
                }else{
                    int num=temp.get(j-1)+mat.get(i).get(j);
                   temp.add(num);
                }
            }
            pfs.add(temp);
        }
       //Row Wise Sum
        for(int j=0;j<pfs.get(0).size();j++){
            int sum=0;
            for(int i=0;i<pfs.size();i++){
                if(i==0) {
                    sum=pfs.get(i).get(j);
                }else{
                    sum=pfs.get(i-1).get(j)+pfs.get(i).get(j);

                }
                ArrayList<Integer> temp=pfs.get(i);
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
