import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class represents a solution to the problem of determining whether a binary tree is a valid binary search tree.
 * The time complexity of the program is O(n), where n is the number of nodes in the binary tree.
 * The space complexity of the program is O(n), as it uses an ArrayList to store the sorted values of the binary tree.
 */
class Solution {
    /**
     * Recursive method to build a sorted list of values from a binary tree.
     * @param node The current node in the binary tree
     * @param result The list to store the sorted values
     * @return The updated list of sorted values
     */
    public ArrayList<Integer> buildSortedList(TreeNode node, ArrayList<Integer> result){
        if(node == null) return result;

        // Traverse the left subtree
        result = buildSortedList(node.left, result);
        
        // Add the current node's value to the list
        result.add(node.val);
        
        // Traverse the right subtree
        result = buildSortedList(node.right, result);

        return result;
    }
    
    /**
     * Method to determine whether a binary tree is a valid binary search tree.
     * @param root The root node of the binary tree
     * @return True if the binary tree is a valid binary search tree, false otherwise
     */
    public boolean isValidBST(TreeNode root) {
        // Build a sorted list of values from the binary tree
        ArrayList<Integer> results = buildSortedList(root, new ArrayList<Integer>());
        
        // Create a HashMap to store the frequency of each value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each value in the sorted list
        for(Integer num : results){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int currentMax = Integer.MIN_VALUE;

        // Check if the sorted list is in ascending order and each value appears only once
        for(Integer cur : results){
            if(currentMax > cur || map.get(cur) > 1) return false;
            currentMax = Math.max(currentMax, cur);
        }
        
        return true;
    }
}