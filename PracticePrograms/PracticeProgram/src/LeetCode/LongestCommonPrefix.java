package LeetCode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs=new String[]{"flower","flow","flight"};
        String prefix=getPrefix(strs);
        System.out.println(prefix);

    }

    private static String getPrefix(String[] strs) {
        int numberOfStrings=strs.length;
        for(int i=0;i<strs[0].length();++i){
            for(int j=1;j<strs.length;++j){

                if(strs[j].length()<=i || strs[j].charAt(i)!=strs[0].charAt(i)){
                    return strs[0].substring(0,i);

                }

            }
        }
        return strs[0];
    }
}
