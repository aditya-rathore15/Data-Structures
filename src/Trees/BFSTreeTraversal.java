package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTreeTraversal {

    public void levelOrder(TreeNode root) {
        if(root == null) return;

        // We use a Queue (FIFO structure) to keep track of nodes we need to visit
        // BFS visits nodes in the order they are discovered.
        // Queue works in FIFO (First In, First Out) fashion:
        // Enqueue children as they are discovered.
        // Dequeue nodes in the order they were enqueued.

        // LinkedList is used here because it implements the Queue interface in Java
        Queue<TreeNode> queue = new LinkedList<>();

        // Start traversal from the root node by adding it to the queue
        queue.offer(root);

        // Continue until there are no more nodes left in the queue
        // Meaning as long as there are nodes left to process
        while(!queue.isEmpty()) {

            // Remove the node at the front of the queue
            TreeNode node = queue.poll();

            // Process the current node (here, we simply print its value)
            System.out.print(node.val + " ");

            // If the current node has a left child, add it to the queue
            if(node.left != null) queue.offer(node.left);

            // If the current node has a right child, add it to the queue
            if(node.right != null) queue.offer(node.right);
        }
    }
}