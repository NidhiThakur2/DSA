package DataStructure.Tree.Traversal;

import DataStructure.Tree.BinarySearchTree;
import DataStructure.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class PostOrderTraversalNonRecursive {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(0);
        root.leftNode=new TreeNode(2);
        root.rightNode= new TreeNode(3);
        root.leftNode.leftNode=new TreeNode(4);
        root.leftNode.rightNode= new TreeNode(5);
        ArrayList<Integer> postOrder=postOrderTraversal(root);
        postOrder.stream().forEach(System.out::println);
    }

    private static ArrayList<Integer> postOrderTraversal(TreeNode root) {
        Stack<TreeNode> stack=new Stack<>();
        TreeNode previous=null;
        ArrayList<Integer> postOrder=new ArrayList<>();
        do{
            while(root!=null){
                stack.push(root);
                root=root.getLeftNode();
            }
            while(root==null && !stack.isEmpty()){
                root=stack.peek();
                if(root.getRightNode()==null || root.getRightNode()==previous){
                    postOrder.add(root.getData());
                    stack.pop();
                    previous=root;
                    root=null;
                }else{
                    root=root.getRightNode();
                }
            }
        }while(!stack.isEmpty());
        return postOrder;
    }
}
