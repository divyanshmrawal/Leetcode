//QUESTION-->
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

// Letters are case sensitive, so "a" is considered a different type of stone from "A".

//ANSWER-->

// Approch 1 :- Using String
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int size=stones.length();
        int result=0;
        for(int i=0;i<size;i++){
           if (jewels.contains(String.valueOf(stones.charAt(i)))) {

                result++;
            }
        }

        return result;
    }
}
//Time complexity:O(n)
// Space complexity:O(1)

// Approch 2 :- Using Hashmap


class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Hashtable<Character, Boolean> jewelTable = new Hashtable<>();
        
        // Store jewels in the hash table
        for (char c : jewels.toCharArray()) {
            jewelTable.put(c, true);
        }

        int result = 0;
        // Count the stones that are jewels
        for (char c : stones.toCharArray()) {
            if (jewelTable.containsKey(c)) {
                result++;
            }
        }

        return result;
    }
}
// Time Complexity: O(M + N)
// Space Complexity: O(M)
