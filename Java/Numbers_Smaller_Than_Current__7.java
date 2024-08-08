//QUESTION-->
//How Many Numbers Are Smaller Than the Current Number

//ANSWER-->
class Numbers_Smaller_Than_Current__7 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[];
        ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count=count+1;
                }
            }
        ans[i]=count;
        }
        return (ans);
    }
}