package PracticePrograms;

public class SquareRoot {
    public static void main(String[] args) {
        double number=10;
        double sqrt=findSqrt(number);
        System.out.println("Squre Root"+sqrt);
    }

    private static double findSqrt(double number) {
        double sqrt=0;
        int i=1;
        while(true){
            if(i*i==number)
                return i;
            else if(i*i>number){
                sqrt= findSqrt(number,i-1,i);
                return sqrt;
            }
            ++i;
        }

    }

    private static double findSqrt(double number, double first, double last) {
        double mid=findMid(first,last);
        double sqrt=0.0;
        double square=mid*mid;
        if(square==number||Math.abs(square-number)<0.0000001) {
            sqrt = mid;
            return sqrt;
        }
        else if(square>number) {
             return findSqrt(number, first, mid);
        }else {
             return findSqrt(number, mid, last);
        }
    }
    private static Double findMid(double first, double last) {
        return (first+last)/2;
    }
}
