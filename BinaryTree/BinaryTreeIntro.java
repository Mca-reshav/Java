/*
Tree: It is a non-linear data structure used for storing data.
It is made up of nodes and edges without having any cycle.
Each node in a tree can point to 'n' number of nodes in a tree.
It is a way of representing hierarchical structure with a parent node i.e., root node
and many levels of additional nodes

                (1)     <---root
                /\
               /  \
              v   v
            (2)   (3)
            /\     /\
           /  \   /  \
          v   v  v   v
        (4)  (5) (6) (7)    <---leaf

Binary tree: A tree is called as binary tree, if each node has zero, one or two children.
          ------------------------
null <--- | left | Data | right |---> null
          -----------------------

public class TreeNode{
    private int data;
    private treeNode left;
    private treeNode right;
    public treeNode(int data){
    this.data=data;
    }
}
* */

package BinaryTree;

public class BinaryTreeIntro {
    public static void main(String[] args) {
        System.out.println("Binary Tree");
    }
}
