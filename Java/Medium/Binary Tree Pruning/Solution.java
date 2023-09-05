// This program prunes a binary tree by removing all subtrees that do not contain the value 1.
// The time complexity of this program is O(n), where n is the number of nodes in the tree.
// The space complexity is O(h), where h is the height of the tree.

class Solution {
    // Helper method to check if a subtree has the value 1
    private boolean subtreeHasOne(TreeNode node){
        // Base case: if the node is null, return false
        if(node == null) return false;
        
        // Recursively check if the left and right subtrees have the value 1
        boolean leftOne = subtreeHasOne(node.left);
        boolean rightOne = subtreeHasOne(node.right);
        
        // If the left subtree does not have the value 1, set it to null
        if(!leftOne) node.left = null;
        // If the right subtree does not have the value 1, set it to null
        if(!rightOne) node.right = null;
        
        // Return true if the current node has the value 1 or if either of its subtrees have the value 1
        return node.val == 1 || leftOne || rightOne;
    }
    
    // Method to prune the tree
    public TreeNode pruneTree(TreeNode root) {
        // If the root subtree has the value 1, return the root
        if(subtreeHasOne(root)) return root;
        // If the root subtree does not have the value 1, return null
        return null;
    }
}