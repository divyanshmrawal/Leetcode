//QUESTION-->
//You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

// Return the number of consistent strings in the array words.

// Example 1:
// Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
// Output: 2
// Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

// Example 2:
// Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
// Output: 7
// Explanation: All strings are consistent.

// Example 3:
// Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
// Output: 4
// Explanation: Strings "cc", "acd", "ac", and "d" are consistent.

//ANSWER-->
import java.util.HashSet;

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        // Create a HashSet to store the allowed characters
        HashSet<Character> set = new HashSet<>();

        // Add each character from 'allowed' to the HashSet
        for (int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int count = 0; // Counter for consistent strings
        int j = 0;     // Variable for inner loop tracking

        // Iterate through each word in the words array
        for (int i = 0; i < words.length; i++) {
            String temp = words[i];

            // Check if all characters of the word exist in the allowed set
            for (j = 0; j < temp.length(); j++) {
                if (!set.contains(temp.charAt(j))) {
                    break; // If a character is not in the set, break the loop
                }
            }

            // If the loop completes, it means the word is consistent
            if (j == temp.length()) {
                count++;
            }
        }

        // Return the count of consistent strings
        return count;
    }
}

// Time Complexity: O(m * k)
// Space Complexity: O(1)