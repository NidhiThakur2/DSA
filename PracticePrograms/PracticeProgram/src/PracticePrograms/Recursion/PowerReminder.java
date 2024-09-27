package PracticePrograms.Recursion;

public class PowerReminder {
    public static void main(String[] args) {
        int A=2,B=3,C=3;
        int reminder=pow(A,B)%C;
        System.out.println(reminder);
    }

    private static int pow(int a, int b) {
        if(b==0)
            return 1;
        return a*pow(a,b-1);
    }
}
