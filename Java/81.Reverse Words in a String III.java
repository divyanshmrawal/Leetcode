//QUESTION-->
//Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

// Example 1:
// Input: s = "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"

// Example 2:
// Input: s = "Mr Ding"
// Output: "rM gniD"

//ANSWER-->
class Solution {
    public String reverseWords(String s) {
        // Split the string by spaces to get individual words
        String[] words = s.split(" ");
        
        // StringBuilder to store the final result
        StringBuilder result = new StringBuilder();
        
        // Iterate through each word
        for (String word : words) {
            // Reverse the word using StringBuilder and append to result
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        // Convert StringBuilder to string and trim extra space at the end
        return result.toString().trim();
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)