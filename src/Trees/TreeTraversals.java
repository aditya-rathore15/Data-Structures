package Trees;

//Tree traversal is the process of visiting each node exactly once.
public class TreeTraversals {

    // Inorder : Left -> Root -> Right
    // For BST, this gives sorted order!
    public void inorder(TreeNode root) {
        // "First, I'll handle the base case"

        if(root == null) {
            return;
        }

        // "Now I follow the Left-Root-Right pattern:"

        // "1. Recursively visit left subtree"
        inorder(root.left);

        // "2. Process current node"
        System.out.print(root.val + " ");

        // "3. Recursively visit right subtree"
        inorder(root.right);
    }

    //Preorder: Root -> Left -> Right
    // Good for copying/serializing tree

    /*
    Explanation while coding:
    "Notice how I process the current node BEFORE making recursive calls"
    "This means we always see a parent before its children"
    "That's why it's useful for tree serialization - we can reconstruct the tree from this order"
     */
    public void preorder(TreeNode  root) {
        if(root == null) {
            return;
        }

        System.out.println(root.val +" ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left → Right → Root
    // Good for deleting tree or calculating size

    /*
    Explanation while coding:
    "Key insight: we process the current node AFTER both recursive calls"
    "This ensures children are always processed before their parent"
    "Perfect for tree deletion - delete children before deleting parent"
    "Also great for calculating subtree sizes bottom-up"
     */
    public void postorder(TreeNode root) {
        if(root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

}
