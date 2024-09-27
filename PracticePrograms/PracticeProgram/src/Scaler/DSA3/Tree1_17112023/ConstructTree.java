package Scaler.DSA3.Tree1_17112023;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayList;
import java.util.HashMap;

class TreeNode{

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}


public class ConstructTree {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList<>();
        ArrayList<Integer> B=new ArrayList<>();
        TreeNode ans=construct(A,B);
    }

    private static TreeNode construct(ArrayList<Integer> a, ArrayList<Integer> b) {
        int iLength=a.size();
        int pLength=b.size();
        TreeNode originalTree=constructTree(a,b,0,iLength-1,pLength-1);
        return originalTree;
    }

    private static TreeNode constructTree(ArrayList<Integer> a, ArrayList<Integer> b, int in_l, int in_r, int post_r) {
       if(in_l>in_r) return null;
       TreeNode root=new TreeNode(b.get(post_r));
       int indx=in_l;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int i=0;i<=a.size()-1;i++){
           map.put(a.get(i),i);
       }
       indx=map.get(root.val);
       int lr=in_r-indx;
       root.left=constructTree(a,b,in_l,indx-1,post_r-lr-1);
       root.right=constructTree(a,b,indx+1,in_r,post_r-1);
       return root;
    }

    /*private static TreeNode constructTree(ArrayList<Integer> a, ArrayList<Integer> b, int is, int ie, int ps, int pe) {
        if(ps>pe) return null;
        int root=b.get(pe);
        TreeNode rootNode=new TreeNode(root);
        //find root index in inorder
        int rootIndx=is;
        for(int i=is;i<=ie;i++){
            if(a.get(i)==root) {
                rootIndx = i;
                break;
              //  i++;
            }
        }
        int rightLength=ie-rootIndx;
        rootNode.left=constructTree(a,b,is,rootIndx-1,ps,pe-rightLength-1);
        rootNode.right=constructTree(a,b,rootIndx+1,ie,pe-rightLength,pe);
        return rootNode;
    }*/
}
