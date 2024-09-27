package Scaler.DSA3.Tree2_22012024;

import java.util.ArrayList;

public class BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(1);
        A.left=new TreeNode(2);
        A.left.left= new TreeNode(3);
     //   A.left.left=new TreeNode(4);
    //    A.left.right= new TreeNode(5);
        int ans= isBalance(A);
        System.out.println(ans);
    }

    private static int isBalance(TreeNode a) {
        int h=height(a);
        if(h==-1)
            return 0;
        return 1;
    }

    private static int height(TreeNode a) {
        if(a==null)
            return 0;
        int lh=height(a.left);
        if(lh==-1)
            return -1;
        int rh=height(a.right);
        if(rh==-1)
            return -1;
        if(Math.abs(lh-rh)>1)
            return -1;
        return Math.max(lh,rh)+1;

    }
}
