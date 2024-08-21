//QUESTION-->
//You are given a 0-indexed, strictly increasing integer array nums and a positive integer diff. A triplet (i, j, k) is an arithmetic triplet if the following conditions are met:

// i < j < k,
// nums[j] - nums[i] == diff, and
// nums[k] - nums[j] == diff.
// Return the number of unique arithmetic triplets.

//ANSWER-->
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count=0;
            for(int i=0;i<nums.length;i++){
                for(int j=0;j<nums.length;j++){
                   for(int k=0;k<nums.length;k++){
                if(i<j && j<k){
                    if(nums[j]-nums[i]==diff && nums[k] - nums[j] == diff){
                     count=count+1;
                    }
                }
                   } 
                }
            }
        return count;
    }
}