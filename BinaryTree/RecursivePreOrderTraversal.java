/*
Recursive: function calling itself
    1. visit the root node
    2. traverse the left subtree in preOrder
    3. traverse the right subtree in preOrder
* */
package BinaryTree;

public class RecursivePreOrderTraversal {
    private TreeNode root;
    private static class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBTree(){
        TreeNode first=new TreeNode(1);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        TreeNode fifth=new TreeNode(5);

        root=first;             //1
        first.left=second;      //2
        first.right=third;      //3

        second.left=fourth;     //4
        second.right=fifth;     //5
    }
    public void preOrder(TreeNode root){
        if(root==null){     //base case to exit when you traversed to null
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);    //recursion
        preOrder(root.right);   //recursion
    }
    public static void main(String[] args) {
        System.out.println("Recursive Pre order traversal of a binary tree");
        RecursivePreOrderTraversal rpot=new RecursivePreOrderTraversal();
        rpot.createBTree();
        rpot.preOrder(rpot.root);
    }
}
