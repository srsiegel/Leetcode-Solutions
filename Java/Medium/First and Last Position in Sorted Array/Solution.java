class Solution {
    /**
     * This program implements a solution to find the leftmost and rightmost occurrences of a target element in a sorted array.
     * It uses a binary search approach to find the leftmost and rightmost occurrences separately.
     *
     * Time complexity:
     * - searchRange: O(log n), where n is the number of elements in the array
     * - findLeft: O(log n)
     * - findRight: O(log n)
     *
     * Space complexity: O(1)
     */
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findLeft(nums, target);
        result[1] = findRight(nums, target);
        return result;
    }
    
    private int findLeft(int[] nums, int target){
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int middle = start + ((end - start) / 2);
            
            if(nums[middle] >= target){
                end = middle-1;
            } 
            else start = middle + 1;
            
            if(nums[middle] == target) result = middle;
        }
        
        return result;       
    }
    
    private int findRight(int[] nums, int target){
        int result = -1;
        int start = 0;
        int end = nums.length - 1;
        
        while(start <= end){
            int middle = start + ((end - start) / 2);
            
            if(nums[middle] <= target){
                start = middle + 1;
            }
            else end = middle - 1;
            
            if(nums[middle] == target) result = middle;
        }
        
        return result;
    }
}
