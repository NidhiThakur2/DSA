package PracticePrograms.Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int A=3;
        char a='A',b='B',c='C';
        towerOfHanoi(4,a,b,c);
    }

    private static void towerOfHanoi(int i, char from, char to, char aux) {
        if(i==1){
            System.out.println("from "+from+"To "+to);
            return;
        }
        towerOfHanoi(i-1,from,aux,to);
        System.out.println("from "+from+"To "+to);
        towerOfHanoi(i-1,aux,to,from);
    }
}
