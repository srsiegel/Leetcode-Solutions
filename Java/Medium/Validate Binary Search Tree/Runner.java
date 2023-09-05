/**
 * The Runner class is used to test the functionality of the Solution class.
 * It creates an instance of Solution, defines the binary tree, 
 * calls the isValidBST method, and prints the resulting boolean value.
 * The expected output value should be a boolean indicating whether the binary tree is a valid binary search tree.
 */
class Runner {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();
        
        // Define the binary tree
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        
        // Call the isValidBST method
        boolean result = solution.isValidBST(root);
        
        // Print the resulting boolean value
        System.out.println(result);
        
        // The expected output value should be:
        // true
    }
}