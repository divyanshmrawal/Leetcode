//QUESTION-->
//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

//ANSWER-->
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3){
            for(int i=1;i<nums.length;i++){
                if(nums[0]<nums[i]){
                nums[0]=nums[i];
                }
            }
        }

        else if(nums.length>=3){
             for(int i=1;i<nums.length;i++){
                if(nums[0]>nums[i]){
                nums[0]=nums[i];
                }
            }
        }
        return nums[0];
    }
}