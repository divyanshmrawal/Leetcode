//QUESTION-->
//Given a 0-indexed integer array nums of length n and an integer target, return the number of pairs (i, j) where 0 <= i < j < n and //nums[i] + nums[j] < target.
 

//ANSWER-->
import java.util.ArrayList;
class Count_Pairs_Whose_Sum_is_Less_than_Target__6 {
    public int countPairs(ArrayList<Integer> nums, int target) {
        int count=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    count=count+1;
                }
            }
        }
        return count;
    }
}