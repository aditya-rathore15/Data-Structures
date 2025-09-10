package Trees;

public class BinarySearchTree {
    TreeNode root;

    public void insert(int val) {
        root = insertRecord(root, val);
    }

    private TreeNode insertRecord(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(val < root.val) {
            root.left = insertRecord(root.left, val);
        } else if(val > root.val) {
            root.right = insertRecord(root.right, val);
        }

        return root;
    }

    public boolean search(int val) {
        return searchRecord(root, val);
    }

    private boolean searchRecord(TreeNode root, int val) {
        if(root == null) {
            return false;
        }

        if(val == root.val) {
            return true;
        }

        if(val < root.val) {
            return searchRecord(root.left, val);
        } else {
            return searchRecord(root.right, val);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println(bst.root);           // null
        bst.insert(2);
        System.out.println(bst.root.val);       // 2
        System.out.println(bst.root.left);      // null
    }
}
