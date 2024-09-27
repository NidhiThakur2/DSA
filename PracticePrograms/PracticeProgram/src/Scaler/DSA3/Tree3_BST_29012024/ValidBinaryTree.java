package Scaler.DSA3.Tree3_BST_29012024;

public class ValidBinaryTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(15);
        A.left=new TreeNode(12);
        A.right= new TreeNode(20);
        A.left.left=new TreeNode(10);
        A.left.right= new TreeNode(14);
        A.right.left=new TreeNode(16);
        A.right.right= new TreeNode(27);
        A.left.left.left=new TreeNode(8);
        long min=Integer.MIN_VALUE;
        long max=Integer.MAX_VALUE;
        boolean ans=isValid(A,min,max);
        System.out.println(ans?1:0);
    }

    private static boolean isValid(TreeNode a, long min, long max) {
        if(a==null)
            return true;

        if(a.val<min || a.val>max)
            return false;
        boolean isLeftValid=isValid(a.left,min,a.val);
        boolean isRightValid=isValid(a.right,a.val+1,max);
        return isLeftValid && isRightValid;

    }




}
