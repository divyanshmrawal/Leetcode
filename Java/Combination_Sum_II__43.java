//QUESTION-->
//Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

// Each number in candidates may only be used once in the combination.

// Note: The solution set must not contain duplicate combinations.

//ANSWER-->

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result=new ArrayList<>();

        makecomb(candidates,target,0,new ArrayList<Integer>(),result);
        return result;
    }

private void makecomb(int[] candidates,int target,int start,List<Integer>combinations,List<List<Integer>>result){
    if(target<0){
        return;
    }
    if(target==0){
        result.add(new ArrayList<Integer>(combinations));
        return;
    }
    for(int i=start;i<candidates.length;i++){
    if(i>start && candidates[i]==candidates[i-1]){
        continue;
    }
    if(candidates[i]>target){
        break;
    }
    combinations.add(candidates[i]);
    makecomb(candidates,target-candidates[i],i+1,combinations,result);
    combinations.remove(combinations.size()-1);
    }

}
}