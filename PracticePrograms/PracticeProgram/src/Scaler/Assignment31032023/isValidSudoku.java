package Scaler.Assignment31032023;

import java.util.*;
import java.util.Map;

public class isValidSudoku {
    public static void main(String[] args) {
        ArrayList<String> A = new ArrayList<String>();
        A.add("......2..");
        A.add(".9.7...3.");
        A.add("......8..");
        A.add(".........");
        A.add(".......5.");
        A.add("5........");
        A.add("2........");
        A.add(".6.......");
        A.add("93.....5.");
        /*A.add("....5..1.");
        A.add(".4.3.....");
        A.add(".....3..1");
        A.add("8......2.");
        A.add("..2.7....");
        A.add(".15......");
        A.add(".....2...");
        A.add(".2.9.....");
        A.add("..4......");*/

        Map<Character,Integer> numBlockMap=new HashMap<>();
        Map<Character,HashSet<Integer>> numColMap=new HashMap<>();
        for(int i=0;i<A.size();i++){
            char[] chArr=A.get(i).toCharArray();
            HashSet<Character> ch=new HashSet<>();
            int block=0;
            for(int j=0;j<chArr.length;j++){
                if(chArr[j]=='.')
                    continue;
                else{
                    if(ch.contains(chArr[j])){
                        System.out.println("0");
                        break;
                    }
                    ch.add(chArr[j]);
                    HashSet<Integer> chCol=numColMap.getOrDefault(chArr[j],new HashSet<>());
                    if(chCol!=null && chCol.contains(j)) {
                        System.out.println("Column 0");
                        break;
                    }
                    chCol.add(j);
                    numColMap.put(chArr[j],chCol);
                    if(i<=2){
                        if(j<=2)
                            block=1;
                        else if(j>=3 && j<=5)
                            block=2;
                        else
                            block=3;

                    } else if (i>=3 && i<=5) {
                        if(j<=2)
                            block=4;
                        else if(j>=3 && j<=5)
                            block=5;
                        else
                            block=6;
                    }else{
                        if(j<=2)
                            block=7;
                        else if(j>=3 && j<=5)
                            block=8;
                        else
                            block=9;
                    }
                    if(numBlockMap.getOrDefault(chArr[j],-1)==block) {
                        System.out.println("Column 0");
                        break;
                    }
                    numBlockMap.put(chArr[j],block);
                }
            }

        }
        //System.out.println(numColMap);
        System.out.println(1);
    }
}


