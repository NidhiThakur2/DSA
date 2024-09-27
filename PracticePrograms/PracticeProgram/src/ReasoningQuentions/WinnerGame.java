package ReasoningQuentions;

public class WinnerGame {
    public static void main(String[] args) {
        String winner=solve(2);
        System.out.println(winner);
    }
    public static String solve(int A) {
        int remaining =A;
        int ponny=1,donny=0;
        String winner="no one";
        while(remaining>0){
            if(remaining==1){
                remaining=remaining-1;
                if(ponny==1)
                    winner= "ponny";
                if(donny==1)
                    winner= "donny";
            }else if(remaining==2){
                remaining=remaining-1;
                if(ponny==1){
                    ponny=0;
                    donny=1;
                }
                else{
                    donny=0;
                    ponny=1;
                }
            }else{
                if(ponny==1){
                    remaining=A-(A-2);
                    ponny=0;
                    donny=1;
                }
                else{
                    remaining=A-(A-2);
                    donny=0;
                    ponny=1;
                }
            }
        }
        return winner;
    }

}
