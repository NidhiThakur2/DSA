package Scaler.DSA3.Tree3_BST_29012024;

import java.util.ArrayList;

public class DeleteFromBST {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(2);
        A.left=new TreeNode(1);
        A.right= new TreeNode(3);
        A=delete(A,2);
        System.out.println(A.val);
        System.out.println(A.left);
        System.out.println("deleted");
    }

    private static TreeNode delete(TreeNode a, int b) {
        if(a==null)
            return a;
        TreeNode temp=a;
        TreeNode parent=null;
        if(a.val==b){
            if(a.left==null && a.right==null){
                a=null;
                return a;
            }else if(a.right==null){
                parent=a;
                temp=a.left;
            }else if(a.left==null ){
                parent=a;
                temp=a.right;
            }
            else{
                TreeNode left = a.left;
                TreeNode right = left.right;
                parent=left;
                temp=right;
                if(temp==null) {
                    parent=a;
                    temp = left;
                }
                else{
                    while(temp.right!=null){
                        parent=temp;
                        temp=temp.right;
                    }
                }
            }
            int num=temp.val;
            temp.val=a.val;
            a.val=num;
            if(parent.left==temp)
                parent.left=null;
            if(parent.right==temp)
                parent.right=null;
        }else{
            if(a.val>=b)
                delete(a.left,b);
            delete(a.right,b);
        }
        return a;
    }
}
