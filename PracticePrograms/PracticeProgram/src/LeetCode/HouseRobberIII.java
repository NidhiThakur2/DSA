package LeetCode;

public class HouseRobberIII {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root=generateTree(root);
        int []T= dfs(root);
        System.out.println(Integer.max(T[0],T[1]));
    }

    private static int[] dfs(TreeNode root) {
        if(root==null)
            return new int[]{0,0};
        int []l=dfs(root.left);
        int []r=dfs(root.right);
        int robRoot=root.val+l[1]+r[1];
        int notRobRoot=Integer.max(l[0],l[1])+Integer.max(r[0],r[1]);
        return new int[]{robRoot,notRobRoot};
    }

    private static TreeNode generateTree(TreeNode root) {
        root.left=new TreeNode(4);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(1);
        return root;
    }
}
