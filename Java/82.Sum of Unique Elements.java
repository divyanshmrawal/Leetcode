//QUESTION-->
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
// Return the sum of all the unique elements of nums.

// Example 1:
// Input: nums = [1,2,3,2]
// Output: 4
// Explanation: The unique elements are [1,3], and the sum is 4.

// Example 2:
// Input: nums = [1,1,1,1,1]
// Output: 0
// Explanation: There are no unique elements, and the sum is 0.

// Example 3:
// Input: nums = [1,2,3,4,5]
// Output: 15
// Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

//ANSWER-->
import java.util.HashMap;

class Solution {
    public int sumOfUnique(int[] nums) {
        // Create a HashMap to store the frequency of each number
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count occurrences of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int result = 0;
        // Iterate through the keys and sum up numbers that appear exactly once
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                result += key;
            }
        }

        return result; // Return the sum of unique elements
    }
}

//Time Complexity:O(n)
// Space Complexity:O(n)