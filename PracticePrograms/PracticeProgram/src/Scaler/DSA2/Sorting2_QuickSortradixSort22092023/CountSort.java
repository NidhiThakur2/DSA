package Scaler.DSA2.Sorting2_radixSort22092023;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountSort {
    public static void main(String[] args) {
        int[] A=new int[]{10,9,8};
        for(int i=0;i<=6;i++){
            System.out.println("count sort on digit "+i);
            A=countSortOndigit(A,i);
        }
        Arrays.stream(A).forEach(System.out::println);

    }

    private static int[] countSortOndigit(int[] a, int d) {
        HashMap<Integer, ArrayList<Integer>> hm=new HashMap<>();

        for(int i=0;i<a.length;i++){
            int num=a[i];
            int digit=(num/(int)power(10,d))%10;
            if(hm.get(digit)!=null){
                ArrayList<Integer> nums=hm.get(digit);
                nums.add(num);
                hm.put(digit,nums);
               // hm.entrySet().stream().forEach(e-> System.out.println(e));
            }else{
                ArrayList<Integer> nums=new ArrayList<>();
                nums.add(num);
                hm.put(digit,nums);
               // hm.entrySet().stream().forEach(e-> System.out.println(e));

            }
          //  hm.entrySet().stream().forEach(e-> System.out.println(e));

        }
     //   System.out.println(hm.size());
        int k=0;
        for(int i=0;i<=9;i++){
            if(hm.get(i)!=null) {
                for (int j = 0; j < hm.get(i).size(); j++) {
                    System.out.println(hm.get(i).get(j));
                    a[k] = hm.get(i).get(j);
                    k++;
                }
            }
        }
    //    Arrays.stream(a).forEach(System.out::print);
    //    System.out.println();
        return a;
    }

    private static long power(long i, long d) {
        if(d==0)
            return 1;
        long ans=(long)power(i,d/2);
        if(d%2==0){
            return ans*ans%1000000007;
        }else{
            return (ans*ans%1000000007*i%1000000007)%1000000007;
        }
    }
}
