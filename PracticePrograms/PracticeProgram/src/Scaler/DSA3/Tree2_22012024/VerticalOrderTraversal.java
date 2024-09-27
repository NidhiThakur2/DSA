package Scaler.DSA3.Tree2_22012024;

import java.util.*;
class Pair {
    TreeNode node;
    int col;
    Pair(TreeNode node,int col){
        this.node=node;
        this.col=col;
    }
}

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(1);
        A.left=new TreeNode(2);
        A.right= new TreeNode(3);
        A.left.left=new TreeNode(4);
        A.left.right= new TreeNode(5);
        ArrayList<ArrayList<Integer>> ans= verticalOrderTraversal(A);
        ans.stream().forEach(System.out::println);

    }

    private static ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode a) {
        Queue<Pair> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        int col=0,mincol=0,maxcol=0;
        Map<Integer,ArrayList<Integer>> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        if(a!=null) {
            q.add(new Pair(a,col));
            al.add(a.val);
            hm.put(col,al);
        }
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> nodes=new ArrayList<>();
            for (int i=0 ;i<size;i++){
                Pair pair=q.poll();
                if(pair.node.left!=null) {
                    col=pair.col-1;
                    mincol=Math.min(mincol,col);
                    maxcol=Math.max(maxcol,col);
                    if(hm.containsKey(col))
                        al=hm.get(col);
                    else
                        al=new ArrayList<>();
                    al.add(pair.node.left.val);
                    hm.put(col,al);
                    q.add(new Pair(pair.node.left,col));
                }
                if(pair.node.right!=null) {
                    col=pair.col+1;
                    mincol=Math.min(mincol,col);
                    maxcol=Math.max(maxcol,col);
                    if(hm.containsKey(col))
                        al=hm.get(col);
                    else
                        al=new ArrayList<>();
                    al.add(pair.node.right.val);
                    hm.put(col,al);
                    q.add(new Pair(pair.node.right,col));
                }

            }

          //  ans.add(nodes);
        }
        System.out.println(mincol);
        System.out.println(maxcol);
        for(int i=mincol;i<=maxcol;i++){
            al=hm.get(i);
            ans.add(al);
        }
        return ans;

    }
}
