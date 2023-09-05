import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Create a binary tree for testing
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Test the levelOrder method
        List<List<Integer>> output = solution.levelOrder(root);
        System.out.println("Expected Output: [[3], [9, 20], [15, 7]]");
        System.out.println("Actual Output: " + output);
    }
}
