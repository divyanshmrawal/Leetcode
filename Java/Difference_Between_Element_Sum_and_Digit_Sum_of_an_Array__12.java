//QUESTION-->
//You are given a positive integer array nums.

// The element sum is the sum of all the elements in nums.
// The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
// Return the absolute difference between the element sum and digit sum of nums.

// Note that the absolute difference between two integers x and y is defined as |x - y|.

 

//ANSWER-->
class Solution {
    public int differenceOfSum(int[] nums) {
        int Sumofarray=0;
        int count=0;
      for(int i=0;i<nums.length;i++){
       Sumofarray=Sumofarray+nums[i];
             
        int digits;
            while(nums[i]>0){
        digits=nums[i]%10;
           count=count+digits;
            nums[i]=nums[i]/10;
           }

        }

    

int difference=Math.abs(Sumofarray-count);
return difference;
    }
}