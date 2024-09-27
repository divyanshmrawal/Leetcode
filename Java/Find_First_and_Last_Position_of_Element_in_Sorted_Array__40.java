
//QUESTION-->
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

//ANSWER-->
class Solution {
    public int[] searchRange(int[] num, int target) {
        int [] result={-1,-1};
        int left=finder(num,target,true);
        int right=finder(num,target,false);
        result[0]=left;
        result[1]=right;
        return result;
    }

    private int finder(int[] num,int target,boolean leftfinder){
        int left=0;
        int right=num.length-1;
        int ans=-1;

        while(left<=right){
            int center=left+(right-left)/2;

            if(num[center]>target){
                right  = center-1;
            }
            else if(num[center]<target){
           left=center+1;
            }
            else{
                ans=center;
                if(leftfinder){
                    right=center-1;
                }
                else{
                    left=center+1;
                }
            }
        }
        return ans;
    }


}