package PracticePrograms;

public class PowerOf10 {
    public static void main(String[] args) {
        int num=1000000;
        boolean isPowerOf10=isPowerOf10(num);
        System.out.println("Is Power Of 10 :"+isPowerOf10);
    }

    public static boolean isPowerOf10(int num) {
        int rem=num%10;
        num=num/10;
        if(rem!=0)
            return false;
        if(num==1&&rem==0)
            return true;
        return isPowerOf10(num);
    }
}
