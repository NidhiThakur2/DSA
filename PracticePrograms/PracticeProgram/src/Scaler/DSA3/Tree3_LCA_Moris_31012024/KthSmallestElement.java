package Scaler.DSA3.Tree3_LCA_Moris_31012024;



public class KthSmallestElement {
   // static int B=1;
    public static void main(String[] args) {
        TreeNode A=new TreeNode(15);
        A.left=new TreeNode(12);
        A.right= new TreeNode(20);
        A.left.left=new TreeNode(10);
        A.left.right= new TreeNode(14);
        A.right.left=new TreeNode(16);
        A.right.right= new TreeNode(27);
        A.left.left.left=new TreeNode(8);
        int B=1;
        int ans=kThSmallest(A,B);
        System.out.println(ans);
    }

    private static int kThSmallest(TreeNode a,int b) {
        if(a==null)
            return -1;
        int left=kThSmallest(a.left,b);
        if(left!=-1)
            return left;
        b--;
        if(b==0)
            return a.val;
        return kThSmallest(a.right,b);




    }
}
