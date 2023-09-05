/**
 * This program performs a level order traversal on a binary tree and returns a list of lists, where each inner list represents a level of the tree.
 * It uses a queue to perform the traversal and keeps track of the size of each level to separate them in the resulting list.
 * 
 * Time complexity: O(n), where n is the number of nodes in the binary tree
 * Space complexity: O(m), where m is the maximum number of nodes at any level in the binary tree
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> returnList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int size = 1;

        if(root == null) return returnList;

        q.add(root);

        while(!q.isEmpty()){
            // Create a temporary list to store the values at the current level
            List<Integer> tmpList = new ArrayList<>();
            tmpList.clear();

            // Iterate through the nodes at the current level
            for(int i = 0; i < size; i++){
                // Add the left and right children of the current node to the queue
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                // Add the value of the current node to the temporary list
                tmpList.add(q.poll().val);
            }
            
            // Update the size for the next level
            size = q.size();
            
            // Add the temporary list to the return list
            returnList.add(tmpList);
        }

        return returnList;
    }
}
