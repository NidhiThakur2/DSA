package DataStructure.Tree.Traversal;

import DataStructure.Tree.TreeNode;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.leftNode=new TreeNode(2);
        root.rightNode= new TreeNode(3);
        root.leftNode.leftNode=new TreeNode(4);
        root.leftNode.rightNode= new TreeNode(5);
        ArrayList<Integer> levelOrder=levelOrderTraversal(root);
        levelOrder.stream().forEach(System.out::println);
    }

    private static ArrayList<Integer> levelOrderTraversal(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> levelOrder=new ArrayList<>();
        if(root!=null)
            queue.add(root);
        while(root!=null && !queue.isEmpty()){
            TreeNode temp=queue.poll();
            levelOrder.add(temp.data);
            if(temp.leftNode!=null)
                queue.add(temp.leftNode);
            if(temp.rightNode!=null)
                queue.add(temp.rightNode);
        }
        return levelOrder;
    }
}
