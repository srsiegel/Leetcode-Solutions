import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        // Create a sample wall
        List<List<Integer>> wall = new ArrayList<>();
        wall.add(List.of(1, 2, 2, 1));
        wall.add(List.of(3, 1, 2));
        wall.add(List.of(1, 3, 2));
        wall.add(List.of(2, 4));
        wall.add(List.of(3, 1, 2));
        wall.add(List.of(1, 3, 1, 1));

        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Calculate the minimum number of bricks to be crossed using the leastBricks method
        int minBricks = solution.leastBricks(wall);

        // Print the minimum number of bricks to be crossed (Ans: 2)
        System.out.println("Minimum number of bricks to be crossed: " + minBricks);
    }
}
