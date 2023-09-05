import java.util.Arrays;

class Solution {
    /**
     * This program calculates the maximum number of ice creams that can be bought with a given amount of coins.
     * It sorts the costs array in ascending order so that we can use binary search to find the maximum number of ice creams.
     * It then iterates through the sorted costs array and checks if the remaining coins are sufficient to buy each ice cream.
     * If the remaining coins are sufficient, it subtracts the cost of the ice cream from the remaining coins and increments the count.
     * If the remaining coins are not sufficient, it breaks out of the loop.
     * Finally, it returns the count, which represents the maximum number of ice creams that can be bought.
     *
     * Time complexity: O(n * log n), where n is the length of the costs array
     * - Sorting the costs array takes O(n * log n) time
     * - The for loop iterates through the costs array once, which takes O(n) time
     *
     * Space complexity: O(1)
     */
    public int maxIceCream(int[] costs, int coins) {
        int count = 0;
        
        // Sort costs so we can use binary search
        Arrays.sort(costs);
        
        for(int i = 0; i < costs.length; i++){
            if(coins - costs[i] >= 0){
                coins -= costs[i];
                count++;
            } else{
                break;
            }
        }
        
        return count;
    }
}
