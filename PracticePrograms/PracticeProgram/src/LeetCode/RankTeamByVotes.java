package LeetCode;

import java.util.Arrays;
import java.util.stream.Stream;

public class RankTeamByVotes {
    public static void main(String[] args) {
        String []votes=new String[]{"BCA","CAB","CBA","ABC","ACB","BAC"};
        //String []votes=new String[]{"WXYZ","XYZW"};
       // String []votes=new String[]{"ZMNAGUEDSJYLBOPHRQICWFXTVK"};
        int [][] rankTeamMatrix=new int[27][27];
        int totalTeams=votes[0].length();
        if(votes.length==1)
            System.out.println(votes[0]);
        else {
            for (int k = 0; k < votes.length; k++) {
                int strLength = votes[k].length();
                for (int i = 0; i < strLength; i++) {
                    char ch = votes[k].charAt(i);
                    int team = (ch - 'A') + 1;
                    //System.out.println((char)('A'+ (team-1)));
                    int rank = i + 1;
                    rankTeamMatrix[rank][team] += 1;
                }
            }
            System.out.println(Arrays.deepToString(rankTeamMatrix));
            StringBuilder sb = new StringBuilder();
            int max = rankTeamMatrix[0][0];
            int teamIndex = 1;
            int teamIndex1 = 0;
            char ch;

            for (int i = 1; i <= 26; i++) {
                if (sb.length() == totalTeams)
                    break;
                max = rankTeamMatrix[i][0];
                teamIndex=0;
                teamIndex1=0;
                for (int j = 1; j <= 26; j++) {
                    if(rankTeamMatrix[i][j]==0)
                        continue;
                    if (max < rankTeamMatrix[i][j]) {
                        max = rankTeamMatrix[i][j];
                        teamIndex = j;
                    }
                    else if(max == rankTeamMatrix[i][j]) {
                        int tMax= Integer.max(teamIndex,j);
                        int tMin= Integer.min(teamIndex,j);
                        teamIndex=tMax;
                        teamIndex1=tMin;
                    }
                }
                ch = (char) ('A' + (teamIndex - 1));
                if(!sb.toString().contains(String.valueOf(ch))) {
                    sb = sb.append(ch);
                    rankTeamMatrix[i][teamIndex]=0;
                }
                if(teamIndex1!=0){
                    char ch1 = (char) ('A' + (teamIndex1 - 1));
                    if(!sb.toString().contains(String.valueOf(ch1))) {
                        sb = sb.append(ch1);
                        rankTeamMatrix[i][teamIndex1]=0;
                    }
                }

            }
            System.out.println(sb.toString());
        }
    }
}
