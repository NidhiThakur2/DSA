package PracticePrograms;

import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}

public class KthSmallestIntegerInBST {
    public static void main(String[] args) {
        int k=4;
        TreeNode root=new TreeNode(5);
        root.left=new TreeNode(3);
        root.right=new TreeNode(6);
        root.left.left=new TreeNode(2);
        root.left.right=new TreeNode(4);
        root.left.left.left=new TreeNode(1);
        int ans=inOrder(root,k);
        System.out.println(ans);
    }

    private static int inOrder(TreeNode root,int k) {
        Stack<TreeNode> stack=new Stack<>();
        while(root!=null || !stack.isEmpty()){
            //keep adding left nodes in stack
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            //smallest element is on the top of the stack
            root=stack.pop();
            k--;
            if(k==0)
                return root.val;
            //if after poping did not fetched the kth smallest element search in right subtree
            root=root.right;
        }
        return 0;
    }
}
