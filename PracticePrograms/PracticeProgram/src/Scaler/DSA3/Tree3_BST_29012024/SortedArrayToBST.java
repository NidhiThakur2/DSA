package Scaler.DSA3.Tree3_BST_29012024;

public class SortedArrayToBST {
    public static void main(String[] args) {
        int[] A=new int[]{1, 2, 3, 5, 10};
        TreeNode root=arraytoBST(A,0,A.length-1);
    }

    private static TreeNode arraytoBST(int[] a, int left, int right) {
        if(left>right)
            return null;
        if(left==right)
            return new TreeNode(a[left]);
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(a[mid]);
        root.left=arraytoBST(a,left,mid-1);
        root.right=arraytoBST(a,mid+1,right);
        return root;

    }
}
