import java.util.*;
class Kids_With_the_Greatest_Number_of_Candies__5 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=0;
        for(int c:candies){
            maxCandies=Math.max(maxCandies,c);
        }
        List<Boolean> result =new ArrayList<>();
        for(int candy:candies){
            if(candy+extraCandies>=maxCandies){
                result.add(true);
            }
            else{
                result.add(false);
            }
        }
        return result;
    }
}