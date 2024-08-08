import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode( int value){
        this.value=value;
        left=right=null;
    } 
}
    public class postorde{
    public void inorder(TreeNode root){
        if(root==null)
        return;
        
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
   
        public void preorder(TreeNode root){
            if(root==null)
            return;
            System.out.print(root.value+" ");
            preorder(root.left);
            preorder(root.right);}
        
    public void postorder(TreeNode root){
        if(root==null)
        return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(3);
        root.left.left.right=new TreeNode(9);
        root.left.left.right.left=new TreeNode(1);
        root.right=new TreeNode(5);
        root.right.left=new TreeNode(7);
        root.right.right=new TreeNode(6);
        root.right.right.left=new TreeNode(8);
        postorde tree=new postorde(); 
        System.out.println("Inorder Traversal");
        tree.inorder(root);
        System.out.println("");
        System.out.println("preorder Traversal");
        tree.preorder(root);
        System.out.println("");
        System.out.println("postorder Traversal");
        tree.postorder(root);

    }
}
