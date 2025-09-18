package Trees;

/*
The height (or depth) of a binary tree is:
The number of edges (or sometimes nodes, depending on definition) on the longest path from the root to a leaf.


Time Complexity: O(n)
Space Complexity: O(h) recursion stack, where h is tree height (worst case O(n) if tree is skewed, O(log n) if balanced)
 */
public class HeightOfBinaryTree {
    public static int height(TreeNode root) {
        if(root == null) return 0;

        return 1+ Math.max(height(root.left), height(root.right));
    }
}