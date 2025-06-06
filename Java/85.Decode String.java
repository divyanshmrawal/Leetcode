//QUESTION-->
//Given an encoded string, return its decoded string.
/*
The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.

You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].

The test cases are generated so that the length of the output will never exceed 105.

Example 1:
Input: s = "3[a]2[bc]"
Output: "aaabcbc"

Example 2:
Input: s = "3[a2[c]]"
Output: "accaccacc"

Example 3:
Input: s = "2[abc]3[cd]ef"
Output: "abcabccdcdcdef"
*/
//ANSWER-->

class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>(); // Stack to store repetition counts
        Stack<StringBuilder> st1 = new Stack<>(); // Stack to store intermediate string builders
        StringBuilder sb = new StringBuilder(); // Current string being processed
        int n = 0; // To store the current number (multiplier)

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                // Build the number (can be multi-digit)
                n = n * 10 + (c - '0');
            } else if (c == '[') {
                // Push the number and current string to their respective stacks
                st.push(n);
                n = 0; // Reset n for the next number
                st1.push(sb);
                sb = new StringBuilder(); // Start a new string inside the brackets
            } else if (c == ']') {
                // Pop the repetition count
                int k = st.pop();
                StringBuilder temp = sb;
                sb = st1.pop(); // Get the previous string
                while (k-- > 0) {
                    sb.append(temp); // Append the repeated string
                }
            } else {
                // Append characters to the current string
                sb.append(c);
            }
        }

        return sb.toString();
    }
}

// Time Complexity: O(N * M)
// Space Complexity: O(N * M + D)