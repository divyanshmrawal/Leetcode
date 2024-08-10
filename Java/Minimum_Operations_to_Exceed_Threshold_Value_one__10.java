//QUESTION-->
//You are given a 0-indexed integer array nums, and an integer k.
// In one operation, you can remove one occurrence of the smallest element of nums.
// Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.

//ANSWER-->
class Minimum_Operations_to_Exceed_Threshold_Value_one__10 {
    public int minOperations(int[] nums, int k) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
            count=count+1;
            }
        }
        return count;
    }
}