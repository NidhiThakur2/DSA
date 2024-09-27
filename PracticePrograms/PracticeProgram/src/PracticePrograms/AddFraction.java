package PracticePrograms;

public class AddFraction {
    public static void main(String[] args) {
        int[] fraction1=new int[]{2,3};
        int[] fraction2=new int[]{1,2};
        int[] result=new int[2];
        result[1]=findLCM(fraction1[1],fraction2[1]);
        if(fraction1[1]==fraction2[1])
            result[0]=fraction1[0]+fraction2[0];
        else{
            result[0]=fraction1[0]*(result[1]/fraction1[1])+fraction2[0]*(result[1]/fraction2[1]);
        }
        System.out.println("Result is :("+result[0]+","+result[1]+")");
    }

    private static int findLCM(int i, int i1) {
        int lcm= i>i1?i:i1;
        while(true) {
            if (lcm % i == 0 && lcm % i1 == 0) {
                break;
            }
            ++lcm;
        }
        return lcm;
    }
}
