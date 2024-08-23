//QUESTION-->
//You are given two integer arrays nums1 and nums2 of sizes n and m, respectively. Calculate the following values:

// answer1 : the number of indices i such that nums1[i] exists in nums2.
// answer2 : the number of indices i such that nums2[i] exists in nums1.
// Return [answer1,answer2].

//ANSWER-->
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int answer1=0;
        int answer2=0;

        for(int i=0;i<nums1.length;i++){
        for(int k=0;k<nums2.length;k++){
            if(nums1[i]==nums2[k]){
                answer1++;
                break;
            }
        }
        }

        for(int j=0;j<nums2.length;j++){
            for(int p=0;p<nums1.length;p++){
                if(nums2[j]==nums1[p]){
                answer2++;
                break;
                }
            }
        }
       return new int[]{answer1,answer2};
    }

}