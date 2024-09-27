package PracticePrograms.Arrays;

import java.util.Arrays;

public class PlateformNeeded {
    public static void main(String[] args) {
        int arr[]=new int[]{900, 940, 950, 1100, 1500, 1800};
        int dept[]=new int[]{910, 1200, 1120, 1130, 1900, 2000};
        Arrays.sort(arr);
        Arrays.sort(dept);
        int count=1,result=1;
        int i=1,j=0;
        while(i<arr.length && j<dept.length){
            if(arr[i]<=dept[j]){
                count++;
                i++;
            }
            else if(arr[i]>dept[j]){
                count--;
                j++;
            }
            result=Math.max(result,count);

        }
        System.out.println(result);
    }
}
