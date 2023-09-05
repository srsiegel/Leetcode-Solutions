// Runner class for the solution
public class Runner {
    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode();
        root.right = new TreeNode(0);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Prune the tree using the pruneTree method
        TreeNode prunedTree = solution.pruneTree(root);
        
        // Print the pruned tree
        printTree(prunedTree);
    }
    
    // Method to print the tree
    static void printTree(TreeNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        
        System.out.println(node.val);
        printTree(node.left);
        printTree(node.right);
    }
}
