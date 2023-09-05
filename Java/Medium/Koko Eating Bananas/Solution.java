import java.util.Arrays;

class Solution {
    /**
     * This program calculates the minimum eating speed required to eat all the bananas within a given time limit.
     * It uses a binary search approach to find the minimum eating speed.
     * The eating speed is represented by the middle value between the start and end points.
     * For each eating speed, it calculates the total number of hours required to eat all the piles of bananas.
     * If the total number of hours is less than or equal to the given time limit, it updates the result and moves the end point to the left.
     * If the total number of hours is greater than the given time limit, it moves the start point to the right.
     * Finally, it returns the result, which represents the minimum eating speed.
     *
     * Time complexity: O(n * log m), where n is the number of piles and m is the maximum number of bananas in a pile
     * - Sorting the piles takes O(n * log n) time
     * - The binary search iterates log m times, where m is the maximum number of bananas in a pile
     * - Calculating the total number of hours for each eating speed takes O(n) time
     *
     * Space complexity: O(1)
     */
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];
        int result = end;
        
        while(start <= end){
            int middle = start + (end - start) / 2;
            int hours = 0;
            
            for(int i : piles){
                hours += Math.ceil((i * 1.0)/(middle * 1.0)); 
            }
             
            if(hours <= h){
                result = Math.min(result, middle);
                end = middle - 1;
            } else{
                start = middle + 1;
            }
        }
        
        return result;
    }
}
