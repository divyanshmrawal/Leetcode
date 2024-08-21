//QUESTION-->
//Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.

// The value of |x| is defined as:

// x if x >= 0.
// -x if x < 0.

//ANSWER-->
class Solution {
    public int countKDifference(int[] nums, int k) {
  
        int count=0;


        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i<j){
                    if(Math.abs(nums[i]-nums[j])==k){
                    count=count+1;
                    }
                }
            }
        }
        return count;
    }
}