import java.util.HashSet;

/**
 * This class represents a solution to the problem of finding the number of connected components in a graph.
 * It uses a depth-first search (DFS) algorithm to traverse the graph and count the number of connected components.
 * The time complexity of the program is O(n^2), where n is the number of nodes in the graph.
 * The space complexity of the program is O(n), where n is the number of nodes in the graph.
 */
class Solution {
  
    /**
     * Helper method to perform depth-first search (DFS) starting from a given node.
     * It recursively visits all connected nodes and adds them to the visited set.
     * @param node The current node being visited
     * @param matrix The adjacency matrix representing the graph
     * @param visited The set of visited nodes
     * @return The updated set of visited nodes
     */
    private HashSet<Integer> dfs(int node, int[][] matrix, HashSet<Integer> visited){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[node][j] == 1 && !visited.contains(j)){
                visited.add(j);
                visited = dfs(j, matrix, visited);
            } 
        }
        return visited;
    }
    
    /**
     * Method to find the number of connected components in the graph.
     * It iterates over each node and performs DFS if the node has not been visited.
     * @param isConnected The adjacency matrix representing the graph
     * @return The number of connected components in the graph
     */
    public int findCircleNum(int[][] isConnected) {
        
        HashSet<Integer> visited = new HashSet<>();
        int groups = 0;
        
        for(int i = 0; i < isConnected.length; i++){
            if(!visited.contains(i)){
                groups++;
                visited.add(i);
                visited = dfs(i, isConnected, visited);
            }
        }
        return groups;
    }
}