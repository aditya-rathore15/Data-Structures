package Trees;

public class BinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

//        Approach 2
//        TreeNode leftChild = new TreeNode(2);
//        TreeNode rightChild = new TreeNode(3);
//        TreeNode root = new TreeNode(1, leftChild, rightChild);


//        Approach 3
//        TreeNode root = new TreeNode(1,
//                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
//                new TreeNode(3));

        System.out.println("Done!");
    }
}
