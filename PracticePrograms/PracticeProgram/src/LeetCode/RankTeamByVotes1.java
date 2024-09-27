package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RankTeamByVotes1 {
    public static void main(String[] args) {
        String[] votes = new String[]{"BCA", "CAB", "CBA", "ABC", "ACB", "BAC"};
        // String []votes=new String[]{"ABC","ACB","ABC","ACB","ACB"};
        // String []votes=new String[]{"WXYZ","XYZW"};
        System.out.println(rankTeams(votes));
    }
    public static String rankTeams(String[] votes) {

        int totalTeams=votes[0].length();
        int [][] rankTeamMatrix=new int[26][totalTeams];
        for (int k = 0; k < votes.length; k++) {
            for (int i = 0; i < totalTeams; i++) {
                char ch = votes[k].charAt(i);
                rankTeamMatrix[ch-'A'][i]++;
            }
        }
        Character []ch=new Character[totalTeams];
        for(int i=0;i<totalTeams;i++){
            ch[i]=votes[0].charAt(i);
        }
        Arrays.sort(ch,(a, b)->{
            for(int i=0;i<totalTeams;i++)
                if(rankTeamMatrix[a-'A'][i]!=rankTeamMatrix[b-'A'][i])
                    return rankTeamMatrix[b-'A'][i]-rankTeamMatrix[a-'A'][i];
            return a-b;

        });
        char[] ans=new char[totalTeams];
        for(int i=0;i<totalTeams;i++)
            ans[i]=ch[i];
        return new String(ans);

    }
}
