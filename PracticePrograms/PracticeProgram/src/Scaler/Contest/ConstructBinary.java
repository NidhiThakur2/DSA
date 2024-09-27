package Scaler.Contest;

public class ConstructBinary {
    public static void main(String[] args) {
        int A=19,B=0;
        int count=1;
        int powOf2=1,num;
        if(B==0)
            num=1;
        else
            num=0;
        for(int i=2;i<=(A+B);i++){
            powOf2=powOf2*2;
            if(count>=B){
                num=num+powOf2;
            }else
                count++;
        }
        System.out.println(num);
    }
}
