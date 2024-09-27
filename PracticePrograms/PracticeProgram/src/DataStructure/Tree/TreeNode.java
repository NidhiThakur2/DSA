package DataStructure.Tree;

public class TreeNode {
    public Integer data;
    public TreeNode leftNode;
    public TreeNode rightNode;

    public TreeNode(Integer data){
        this.data=data;
     //   this.leftNode=null;
     //   this.rightNode=null;
    }

    public TreeNode find(int number){
            TreeNode presentNode=null;
            if(this.data==number){
                presentNode=this;
            }else {
                if (number > this.data && rightNode != null) {
                    presentNode=this.getRightNode().find(number);
                } else {
                    if (leftNode != null)
                        presentNode=this.getLeftNode().find(number);
                }
            }


    return presentNode;
    }
    public void insert(int number){
        if(number>=this.data){
            if(this.rightNode==null){
                this.rightNode=new TreeNode(number);
               // System.out.println("Inserted Right Node"+this.getRightNode().getData());
            }

            else
                this.rightNode.insert(number);

        }else{
            if(this.leftNode==null) {
                this.leftNode = new TreeNode(number);
               // System.out.println("Inserted left Node"+this.getLeftNode().getData());
            }
            else
                leftNode.insert(number);

        }
    }

    public Integer getData() {
        return data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}

