package PracticePrograms.Arrays;

public class FactorialOfLargeNumbers {
    public static void main(String[] args) {
        int num=3;
        String ans=findFactorial(num);
        System.out.println(ans);
    }

    private static String findFactorial(int number) {
        String ans="1";
        for(int i=number;i>1;i--){
            ans=multiply(ans,i);
        }
        return ans;
    }

    private static String multiply(String num, int num1) {
        StringBuilder reversed=new StringBuilder(num).reverse();
        StringBuilder newNumber=new StringBuilder();
        int remainder = 0;
        for(int i=0;i<reversed.length();i++){
            int digit=Character.getNumericValue(reversed.charAt(i));
            int result=digit*num1 + remainder;
            newNumber.insert(0,result%10);
            remainder=result/10;
        }
        if(remainder!=0)
            newNumber.insert(0,remainder);
        return newNumber.toString();
    }
}
