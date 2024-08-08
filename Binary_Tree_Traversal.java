import java.util.*;
class TreeNode{
    int value;
    TreeNode left,right;
    TreeNode( int value){
        this.value=value;
        left=right=null;
    } 
}
public  class inorderTraversal{
    public void inorder(TreeNode root){
        if(root==null)
        return;
        
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public static class preorderTraversal{
        public void preorder(TreeNode root){
            if(root==null)
            return;
            System.out.print(root.value+" ");
            preorder(root.left);
            preorder(root.right);
        }
    public static class postorderTraversal{
    public void postorder(TreeNode root){
        if(root==null)
        return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.left.right.left=new TreeNode(8);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);
        root.right.right.left=new TreeNode(9);
        root.right.right.right=new TreeNode(10);
        inorderTraversal tree=new inorderTraversal(); 
        System.out.println("Inorder Traversal");
        tree.inorder(root);
        preorderTraversal tree1=new preorderTraversal(); 
        System.out.println("");
        System.out.println("preorder Traversal");
        tree1.preorder(root);
        postorderTraversal tree2=new postorderTraversal(); 
        System.out.println("");
        System.out.println("postorder Traversal");
        tree2.postorder(root);

    }
}}}
