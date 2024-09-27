package DataStructure.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree {
    private TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void insert(int number){
        if(root!=null)
            root.insert(number);
        else {
            root = new TreeNode(number);
        }
    }
    public TreeNode find(int number){
        if(root!=null)
            return root.find(number);
        return null;
    }
    public Boolean contains(int number){
        TreeNode presentNode=null;
        Boolean contain=false;
        if(root!=null) {
            presentNode = root.find(number);
            if (presentNode != null)
                contain=true;
        }
        return contain;

    }
    public List<Integer> inOrderTraversal(TreeNode root,List<Integer> treeData) {
        if (root == null) {
            return null;
        }{
            inOrderTraversal(root.getLeftNode(),treeData);
            treeData.add(root.getData());
            inOrderTraversal(root.getRightNode(),treeData);
        }
        return treeData;
    }
    public void delete(int number){
        TreeNode current=this.root;
        TreeNode parent=this.root;
        boolean isLeftNode=false;
        if(current==null)
            return;
        while(current!=null && current.getData()!=number) {
            parent = current;
            if (number < current.getData()) {
                current = current.getLeftNode();
                isLeftNode = true;
            } else {
                current = current.getRightNode();
                isLeftNode = false;
            }
        }
        if(current.getLeftNode()==null && current.getRightNode()==null){
            if(current==root)
                root=null;
            else{
                if(isLeftNode)
                    current.setLeftNode(null);
                else
                    current.setRightNode(null);
            }
        }
    }

}
