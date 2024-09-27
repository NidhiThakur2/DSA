package InterviewBits;

public class NumberOfBits {
    public static void main(String[] args) {
        int A=11;
        int count=0;
        while(A>0){
            if(A%2==1)
                count++;
            A=A/2;
        }
        System.out.println(count);
    }
}
