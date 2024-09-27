package LeetCode;

public class ReverseInteger {
    public static void main(String[] args) {
        Integer num=333333399;
        int y=0;
        boolean overflow=false;
        while(num!=0){
            int lastDigit=num%10;
            int newNumber=y*10+lastDigit;
            if((newNumber-lastDigit)/10 != y){
                overflow=true;
            }
            y=newNumber;
            num=num/10;

        }
        if(overflow)
            System.out.println(0);
        else
            System.out.println(y);
    }
}
