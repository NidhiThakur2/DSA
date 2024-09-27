package PracticePrograms;

import java.util.HashMap;
import java.util.Map;

public class DecimalConversion {
    public static void main(String[] args) {
        int numerator=4,denominator=7;
        String result=fractionToDecimal(numerator,denominator);
        System.out.println(result);
    }
    public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0 || denominator==0)
            return "Inappropriate Operation";
        int quotient=numerator/denominator;
        String result=String.valueOf(quotient);
        int reminder=numerator%denominator;
        Map<Integer,Integer> reminderMap=new HashMap<>();
        if(reminder==0)
            return result;
        reminder=reminder*10;
        result+=".";
        while(reminder!=0){
            if(reminderMap.containsKey(reminder)){
                int firstHalf=reminderMap.get(reminder);
                String part1=result.substring(0,firstHalf);
                String part2=result.substring(firstHalf,result.length());
                result=part1 +"("+part2+")";
                return result;
            }
            reminderMap.put(reminder,result.length());
            result+=String.valueOf(reminder/denominator);
            reminder=(reminder%denominator)*10;
        }
        return result;
    }
}
