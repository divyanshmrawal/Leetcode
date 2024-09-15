//QUESTION-->
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

// Return the sum of the three integers.

// You may assume that each input would have exactly one solution.

//ANSWER-->
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum=Integer.MAX_VALUE/2;
        for(int i=0;i<nums.length;i++){
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int currentsum=nums[i]+nums[left]+nums[right];
            if(Math.abs(currentsum-target)<Math.abs(closestsum-target)){
                closestsum=currentsum;
            }
            if(currentsum<target){
                left++;
            }
            else if(currentsum>target){
                right--;
            }
            else{
                return currentsum;
            }
        }
        }
       return closestsum;
    }
}