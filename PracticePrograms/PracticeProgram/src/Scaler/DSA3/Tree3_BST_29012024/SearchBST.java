package Scaler.DSA3.Tree3_BST_29012024;



public class SearchBST {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(15);
        A.left=new TreeNode(12);
        A.right= new TreeNode(20);
        A.left.left=new TreeNode(10);
        A.left.right= new TreeNode(14);
        A.right.left=new TreeNode(16);
        A.right.right= new TreeNode(27);
        A.left.left.left=new TreeNode(8);
        int ans=search(A,16);
        System.out.println(ans);
    }

    private static int search(TreeNode root, int b) {
        if(root==null)
            return 0;
        if(root.val==b)
            return 1;
        if(root.val>b)
            return search(root.left,b);

        return search(root.right,b);

    }
}
