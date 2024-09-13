//QUESTION-->
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

//ANSWER-->
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         
         List<List<Integer>> result =new ArrayList<>();
   
         for(int i=1;i<nums.length-1;i++){
        int right=i+1;
        int left=i-1;

        if(nums[i]!=nums[right] && nums[i]!=nums[left] && nums[right]!=nums[left]){
         if((nums[i]+nums[right]+nums[left])==0){
            result.add(Arrays.asList(nums[i],nums[left],nums[right]));
         }
        }
         }
         return result;
    }
}