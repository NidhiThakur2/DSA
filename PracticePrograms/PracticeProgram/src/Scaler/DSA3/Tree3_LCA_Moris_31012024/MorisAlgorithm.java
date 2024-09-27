package Scaler.DSA3.Tree3_LCA_Moris_31012024;

import java.util.ArrayList;

public class MorisAlgorithm {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(15);
        A.left=new TreeNode(12);
        A.right= new TreeNode(20);
        A.left.left=new TreeNode(10);
        A.left.right= new TreeNode(14);
        A.right.left=new TreeNode(16);
        A.right.right= new TreeNode(27);
        A.left.left.left=new TreeNode(8);
        int [] ans=moris(A);
 //       ans.stream().forEach(System.out::println);
    }

    private static int[] moris(TreeNode a) {
        ArrayList<Integer> ans=new ArrayList<>();
        TreeNode curr=a;
        while(curr!=null){
            if(curr.left==null){
                ans.add(curr.val);
                curr=curr.right;
            }else{
                TreeNode temp=curr.left;
                while(temp.right!=null && temp.right!=curr){
                    temp=temp.right;
                }
                if(curr.right==null) {
                    temp.right=curr;
                    curr=curr.left;
                }
                else{
                    temp.right=null;
                    ans.add(curr.val);
                    curr=curr.right;
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
