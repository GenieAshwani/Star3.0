import java.util.Scanner;

public class BinaryTree {


    public class Node{
        int val;
        Node left;  //null
        Node right;
     }


    private Node root;
    Scanner sc= new Scanner(System.in);

   public BinaryTree()
    {
        root=createTree();
    }



    private Node createTree()
    {
        System.out.println("Enter node : ");
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        System.out.println("Node "+nn.val+ " has left child : ");
        boolean lc=sc.nextBoolean();
        if(lc)
        {
            nn.left=createTree();
        }
        System.out.println("Node "+nn.val+ " has right child : ");
        boolean rc=sc.nextBoolean();
        if(rc)
        {
            nn.right=createTree();
        }
        return nn;
    }

    public void display(Node node)
    {
        if(node==null) return;
        String s="";
        s="<----"+node.val+"---->";
        if(node.left!=null)
        {
            s=node.left.val+s;
        }
        else{
            s="."+s;
        }
        if(node.right!=null)
        {
            s=s+node.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(node.left);
        //System.out.println(node.val); //while drooping left stack
        display(node.right);
    }

    public void display()
    {
        display(root);
    }

    public void display(TreeNode node)
    {
        if(node==null) return;
        String s="";
        s="<----"+node.val+"---->";
        if(node.left!=null)
        {
            s=node.left.val+s;
        }
        else{
            s="."+s;
        }
        if(node.right!=null)
        {
            s=s+node.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(node.left);
        //System.out.println(node.val); //while drooping left stack
        display(node.right);
    }


}
