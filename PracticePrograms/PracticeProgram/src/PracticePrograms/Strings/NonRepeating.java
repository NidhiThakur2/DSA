package PracticePrograms.Strings;
public class NonRepeating {
    public static void main(String[] args) {
        String input="didhehejkli";
        char firstDistinctCharacter=findFirst(input);
        System.out.println(firstDistinctCharacter);
    }
    public static char findFirst(String input) {
        for(char ch:input.toCharArray()){
            long count=input.chars().filter(c-> c==ch).count();
            if(count==1)
                return ch;
        }
        return '0';
    }
}
