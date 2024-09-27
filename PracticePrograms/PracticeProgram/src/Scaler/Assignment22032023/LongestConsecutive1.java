package Scaler.Assignment22032023;

public class LongestConsecutive1 {
    public static void main(String[] args) {
        String A="1110000";
        char ch[]=A.toCharArray();
        int ans=0,length=0,l=0,r=0;
        int totalCount=0;
        for(int i=0;i<=ch.length-1;i++){
            if(ch[i]=='1')
                totalCount++;
        }
        if(totalCount==ch.length)
            ans=totalCount;
        else {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '0') {
                    l = r;
                    r = 0;
                    int start = ch.length - 1;
                    if (i < ch.length - 2)
                        start = i + 1;
                    for (int j = start; j < ch.length; j++) {
                        if (ch[j] != '0') {
                            r++;

                        } else
                            break;

                    }
                    if ((l + r) == totalCount)
                        length = l + r;
                    if ((l + r) < totalCount)
                        length = l + r + 1;

                    r = 0;
                    if (length >= ans) {
                        ans = length;
                        length = 0;
                    }
                } else
                    r++;
            }
        }
        System.out.println(ans);
    }
}
