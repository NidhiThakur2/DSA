package Scaler.Assignment27032023;

public class LongestPalindrom {
    public static void main(String[] args) {
        String A="aa";
        StringBuilder sb=new StringBuilder();
        int maxLength=0;
        int start=0;
        int end=0;
        if(A.length()%2!=0){
            int tempLength=1;
            maxLength=tempLength;
            for(int i=0;i<=A.length()-1;i++){
                tempLength=1;
                int p1=i-1;
                if(i==0)
                    p1=i;
                int p2=i+1;
                if(i==A.length()-1)
                    p2=A.length()-1;
                while(A.charAt(p1)==A.charAt(p2)&& p1>=0 && p2<=A.length()-1){
                    tempLength+=2;
                    if(tempLength>maxLength) {
                        maxLength = tempLength;
                        start = p1;
                        end = p2;
                    }
                    p1--;
                    p2++;
                    if(p1<0 || p2>A.length()-1)
                        break;
                }
            }
            for(int i=start;i<=end;i++){
                sb.append(A.charAt(i));
            }
        }else{
            int tempLength=2;
            maxLength=tempLength;
            for(int i=1;i<A.length()-2;i++){
                tempLength=2;
                int p1=i-1;
                int p2=i+2;
                if(A.length()==2)
                    p2=i;
                while(A.charAt(p1)==A.charAt(p2)&& p1>=0 && p2<=A.length()-1){
                    tempLength+=2;
                    if(tempLength>maxLength) {
                        maxLength = tempLength;
                        if(A.length()==tempLength)
                            start=p1;
                        else
                            start = p1 + 1;
                        end = p2;
                    }
                    p1--;
                    p2++;
                    if(p1<0 || p2>A.length()-1)
                        break;
                }
            }
            for(int i=start;i<=end;i++){
                sb.append(A.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
  }
