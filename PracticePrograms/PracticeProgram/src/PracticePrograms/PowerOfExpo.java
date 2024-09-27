package PracticePrograms;

public class PowerOfExpo {
    public static void main(String[] args) {
        int number=2, exp=4,result=1;
        result=findPowerOfExpo(number,exp,result);
        System.out.println("Result:"+ result);
    }

    public static int findPowerOfExpo(int number, int exp,int result) {
        if(exp==0)
            return result;
        if(exp<0)
            return -1;
        result=result*number;
        exp--;
        return findPowerOfExpo(number,exp,result);

    }
}
