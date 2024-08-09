class Minimize_Ops_to_Make_Elements_Divisible_by_3__8 {
    public int minimumOperations(int[] nums) {
        int ops = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] % 3 != 0){
                ops += 1;
            }
        }
        return ops;
    }
}