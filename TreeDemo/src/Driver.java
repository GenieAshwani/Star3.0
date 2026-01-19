public class Driver {
    public static void main(String[] args) {

        TreeNode root=new TreeNode(10);
        root.left= new TreeNode(20);
        root.left.left=new TreeNode(30);
        root.left.right=new TreeNode(40);
        root.right=new TreeNode(50);

        BinaryTree bt=new BinaryTree();

       // bt.display(root);
    }
}
