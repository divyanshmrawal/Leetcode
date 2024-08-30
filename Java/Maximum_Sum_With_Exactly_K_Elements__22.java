//QUESTION-->
//You are given a 0-indexed integer array nums and an integer k. Your task is to perform the following operation exactly k times in order to maximize your score:

// Select an element m from nums.
// Remove the selected element m from the array.
// Add a new element with a value of m + 1 to the array.
// Increase your score by m.
// Return the maximum score you can achieve after performing the operation exactly k times.

//ANSWER-->
class Solution {
    public int maximizeSum(int[] nums, int k) {
        
        for(int i=0;i<nums.length;i++){
            if(nums[0]<nums[i]){
                nums[0]=nums[i];
            }
        }
        int count=0;
        for(int i=0;i<k;i++){
            count=count+nums[0];
            nums[0]++;
        }
        return count;
    }
}