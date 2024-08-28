//QUESTION-->
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).

//ANSWER-->
class Solution {
    public int maxProduct(int[] nums) {
        int big1=0;
        int big2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>big1){
                big2=big1;
                big1=nums[i];
            }
            else if(nums[i]>big2){
                big2=nums[i];
            }
        }
        int total=(big1-1)*(big2-1);
        return total;
    }
}