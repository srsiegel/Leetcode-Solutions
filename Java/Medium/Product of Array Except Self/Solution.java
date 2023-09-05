/**
 * This class represents a solution to the problem of finding the product of all elements in an array except the current element.
 * The time complexity of the program is O(n), where n is the length of the input array.
 * The space complexity of the program is O(n), as it uses an additional array of the same length to store the resulting products.
 */
class Solution {
    /**
     * Method to calculate the product of all elements in the input array except the current element.
     * @param nums The input array of integers
     * @return An array of integers representing the product of all elements except the current element
     */
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeros = 0;
        int[] returnArr = new int[nums.length];

        // Calculate the product of all non-zero elements and count the number of zeros
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0) product *= nums[i];
            else zeros++;
        }

        // Calculate the product for each element in the output array
        for(int i = 0; i < nums.length; i++){
            if(zeros == 1 && nums[i] == 0) returnArr[i] = product;
            else if(zeros == 0) returnArr[i] = product / nums[i];
            // If there are more than 1 zero, the product for all elements will be 0
            else returnArr[i] = 0;
        }
        return returnArr;
    }
}