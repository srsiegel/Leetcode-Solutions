import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    /**
     * This program calculates the minimum number of bricks that need to be crossed to reach from the leftmost edge
     * to the rightmost edge of a given wall. The wall is represented as a list of rows, where each row is a list of
     * integers representing the widths of the bricks in that row.
     *
     * Time complexity: O(n), where n is the total number of bricks in the wall
     * Space complexity: O(m), where m is the maximum number of distinct edges between the bricks
     */
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int rows = wall.size();
        int max = 0;

        // Iterate through each row of the wall
        for (List<Integer> row : wall) {
            sum = 0;
            // Iterate through each brick in the row, except the last one
            for (int i = 0; i < row.size() - 1; i++) {
                sum += row.get(i);
                // Store the cumulative sum as a key in the map and increment its count
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // Find the maximum count from the map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        // Return the minimum number of bricks to be crossed
        return rows - max;
    }
}
