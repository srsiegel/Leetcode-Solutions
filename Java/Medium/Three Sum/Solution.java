import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * This class represents a solution to the problem of finding all unique triplets in an array that sum to zero.
 * The time complexity of the program is O(n^2), where n is the length of the input array.
 * The space complexity of the program is O(n), as it uses a set to store the unique triplets.
 */
class Solution {
    /**
     * Method to find all unique triplets in an array that sum to zero.
     * @param nums The input array of integers
     * @return A list of lists containing the unique triplets
     */
    public List<List<Integer>> threeSum(int[] nums) {
        // Sort the array in non-decreasing order
        Arrays.sort(nums);
        
        // Use a set to store the unique triplets
        Set<List<Integer>> ans = new HashSet<>();

        // Iterate through the array
        for(int i = 0; i < nums.length - 2; i++){
            int p1 = i+1;
            int p2 = nums.length - 1;

            // Use two pointers to find the remaining two numbers
            while(p1 < p2){
                int n1 = nums[i];
                int n2 = nums[p1];
                int n3 = nums[p2];
                
                // If the sum of the three numbers is zero, add the triplet to the set
                if(n1+n2+n3 == 0){
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(n1);
                    list.add(n2);
                    list.add(n3);
                    ans.add(list);
                    p1++;
                }
                // If the sum is less than zero, move the first pointer
                else if(n1+n2+n3 < 0) p1++;
                // If the sum is greater than zero, move the second pointer
                else p2--;
            }
        }
        
        // Convert the set of unique triplets to a list and return
        return new ArrayList<>(ans);
    }
}