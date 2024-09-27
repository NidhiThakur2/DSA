package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        List<Integer> treeData=new ArrayList<>();
        TreeNode root=new TreeNode(0);
        TreeNode node=null;
        bst.setRoot(root);
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(10);
        bst.insert(12);
        node=bst.find(12);
        System.out.println("found"+node.getData());
        treeData=bst.inOrderTraversal(root,treeData);
        System.out.println("Contains:"+bst.contains(3));
        System.out.println("Contains:"+bst.contains(15));
        treeData.stream().forEach(System.out::println);
    }
}
