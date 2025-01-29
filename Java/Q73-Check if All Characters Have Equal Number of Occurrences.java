//QUESTION-->
//Given a string s, return true if s is a good string, or false otherwise.

// A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

// Example 1:
// Input: s = "abacbc"
// Output: true
// Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.

// Example 2:
// Input: s = "aaabb"
// Output: false
// Explanation: The characters that appear in s are 'a' and 'b'.
// 'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.

//ANSWER-->
import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        int count = 0, n = s.length();

        // HashMap to store the frequency of each character in the string
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate over the string and count occurrences of each character
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            // If character already exists in the map, increment its count
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } 
            // Otherwise, initialize count to 1
            else {
                map.put(ch, 1);
            }
        }

        // Get the frequency of the first character to compare with others
        count = map.get(s.charAt(0));

        // Iterate through the map to check if all values are the same
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != count) {
                return false; // Return false if any frequency differs
            }
        }

        return true; // Return true if all characters have equal frequency
    }
}

// Time Complexity:O(n)
// Space Complexity:O(n)






