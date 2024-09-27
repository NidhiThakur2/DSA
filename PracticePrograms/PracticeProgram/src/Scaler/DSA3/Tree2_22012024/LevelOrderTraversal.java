package Scaler.DSA3.Tree2_22012024;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(1);
        A.left=new TreeNode(2);
        A.right= new TreeNode(3);
        A.left.left=new TreeNode(4);
        A.left.right= new TreeNode(5);
        ArrayList<ArrayList<Integer>> ans= levelOrderTraversal(A);
        ans.stream().forEach(System.out::println);
    }

    private static ArrayList<ArrayList<Integer>> levelOrderTraversal(TreeNode a) {
        Queue<TreeNode> q=new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<ArrayList<Integer>>();
        if(a!=null)
            q.add(a);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> nodes=new ArrayList<>();
            for (int i=0 ;i<size;i++){
                TreeNode node=q.poll();
                nodes.add(node.val);
                if(node.left!=null)
                    q.add(node.left);
                if(node.right!=null)
                    q.add(node.right);
            }
            ans.add(nodes);
        }
        return ans;
    }
}
