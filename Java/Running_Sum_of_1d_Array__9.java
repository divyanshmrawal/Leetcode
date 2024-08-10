//QUESTION-->
// Running Sum of 1d Array

//ANSWER-->
class Running_Sum_of_1d_Array__9 {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++){
            nums [i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}