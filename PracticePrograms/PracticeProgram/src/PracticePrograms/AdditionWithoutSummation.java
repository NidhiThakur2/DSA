package PracticePrograms;

public class AdditionWithoutSummation {
    public static void main(String[] args) {
        int A=10,B=3;
        int carry =0;
        int ans = add(746, 970);
        System.out.println(ans);
    }

    private static int add(int a, int b){
        int n=0;
        for(int i=0, c=0;i<=31;i++)
        {
            int t=1<<i;
            int a1 = (a&t)>>i;
            int b1=(b&t)>>i;

            int res=a1^b1^c;
            n|=res<<i;

            if((a1&1)==1)
                c=b1|c;
            else
                c=b1&c;
        }

        return n;
    }
}
