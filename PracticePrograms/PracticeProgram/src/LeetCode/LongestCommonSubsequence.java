package LeetCode;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String str1="abcde", str2="ace";
        int length1=str1.length();
        int length2=str2.length();
        int [][] dp=new int[length1+1][length2+1];
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[length1][length2]);
    }
}
