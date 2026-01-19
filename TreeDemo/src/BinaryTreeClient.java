public class BinaryTreeClient {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();

        bt.search(50);
        // 10 true 20 true 30 false false true 60 false false true 50 false false

        int max = bt.findMax();
        System.out.println("max = "+max);

        int height = bt.findHeight();
        System.out.println("height = "+height);


    }
}
