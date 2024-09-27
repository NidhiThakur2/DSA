package Scaler.Assignment17032023;

public class LeapYear {
    public static void main(String[] args) {
        int A=2200;
        int condition1=A%400;
        int condition2=A%4;
        int condition3=A%100;
        if(condition1==0 || condition2==0 && condition3!=0)
              System.out.println(1);
        else
            System.out.println(0);


    }
}
