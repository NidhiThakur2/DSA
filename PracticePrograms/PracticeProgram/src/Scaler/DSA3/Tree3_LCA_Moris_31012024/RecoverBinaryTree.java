package Scaler.DSA3.Tree3_LCA_Moris_31012024;

public class RecoverBinaryTree {
    public static void main(String[] args) {
        TreeNode A=new TreeNode(6);
        A.left=new TreeNode(9);
        A.right= new TreeNode(4);
        A.right.left=new TreeNode(8);
        A.right.left.right= new TreeNode(3);
        int ans[]=recoverTree(A);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }

    private static int[] recoverTree(TreeNode a) {
        int first=Integer.MIN_VALUE,second=0,num=1;
        TreeNode curr=a;
        int []ans=new int[2];
        while(curr!=null){
            if(curr.left==null){
                if(num==1) {
                    if(curr.val>first)
                        first=curr.val;
                    else{
                        num=0;
                        second=curr.val;
                    }
                }else if(curr.val<second){
                    ans[0]= curr.val;
                    ans[1]= first;
                    return ans;
                }
                curr=curr.right;
            }
            else{

                TreeNode temp=curr.left;
                while(temp.right!=null && temp.right!=curr){
                      temp=temp.right;
                }
                if(temp.right==null){
                    temp.right=curr;
                    curr=curr.left;
                }else{
                    temp.right=null;
                    if(num==1) {
                        if(curr.val>first)
                            first=curr.val;
                        else{
                            num=0;
                            second=curr.val;
                        }
                    }else if(curr.val<second){
                        ans[0]= curr.val;
                        ans[1]= first;
                        return ans;
                    }
                    curr=curr.right;
                }
            }

        }
        return ans;
    }
}
