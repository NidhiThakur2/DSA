package PracticePrograms.Arrays;

public class FindFrequencies {
    public static void main(String[] args) {
        int[] num=new int[]{1, 2, 3, 3, 2, 1};
        int k=2;
        int count=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==k)
                count++;
        }
        System.out.println(count);

    }
}
