package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class OptimalPath {
    public static void main(String[] args) {
        int[][] rockCollection={{1,1,2,0,5},{0,1,1,0,0},{0,0,0,10,0}};
        List<Integer> path= new ArrayList<Integer>();
        //path.add(rockCollection[2][0]);
        int col=0;
        for(int row=2;row>=0;row--){
            int maxCol=findmax(rockCollection,row,col);
            for(int i=col;i<=maxCol;i++){
                path.add(rockCollection[row][i]);
            }
            col=maxCol;
        }
        path.stream().forEach(i-> System.out.println(i));


    }
    private static int findmax(int[][] rockCollection, int row,int col) {
        int max=rockCollection[row][0];
        int maxCol=col;
        for(int i=col;i<=4;i++){
                if(rockCollection[row][i]>=max) {
                    max=rockCollection[row][i];
                    maxCol = i;
                }
        }
        return maxCol;
    }
}
