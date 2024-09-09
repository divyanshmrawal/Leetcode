//QUESTION-->
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

//ANSWER-->
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n+1];

        Arrays.fill(arr,-1);

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]==-1){
                return i;
            }
        }
            return 0;
    }
}