//QUESTION-->
//Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

// /ANSWER-->
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
           if (nums.length < 4) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int l=nums.length;

        for(int i=0;i<l;i++){
            if(i>0&&nums[i-1]==nums[i]){
                continue;
            }

           for(int j=i+1;j<l;j++){
            if(j!= i+1 && nums[j]==nums[j-1]){
                continue;
            }

            int left=j+1;
            int right=l-1;

            while(left<right){
                int sum=nums[i]+nums[j]+nums[right]+nums[left];

                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                    left++;
                    right--;
                
                while(left<right && nums[left]==nums[left-1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right+1]){
                  right--;
                }
                }
                else if(sum<target){
                    left++;
                }
                else{
                    right--;
                }
            }
           } 
        }
        return result;
    }
}