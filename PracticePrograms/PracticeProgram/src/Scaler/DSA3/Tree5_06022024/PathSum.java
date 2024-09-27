package Scaler.DSA3.Tree5_06022024;



public class PathSum {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(5);
        A.left= new TreeNode(4);
        A.right= new TreeNode(8);
        A.left.left=new TreeNode(-11);
     //   A.left.right= new TreeNode(14);
        A.right.left=new TreeNode(-13);
        A.right.right= new TreeNode(4);
     //   A.left.left.left=new TreeNode(8);
        int B=-1;
        int ans=0;
        int a=pathSum(A,B,ans);
        System.out.println(a);

    }

    private static int pathSum(TreeNode root, int b,int ans) {
        if(root==null)
            return ans;
        b=b-root.val;
        if(b==0)
            ans=1;
        else
            ans=0;
        ans=pathSum(root.left,b,ans);
        if(ans!=1)
            ans=pathSum(root.right,b,ans);
        return ans;
    }

}
