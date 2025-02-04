//QUESTION-->
/*Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.

Example 1:
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.

Example 2:
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", each substring contains same number of 'L' and 'R'.
Note that s cannot be split into "RL", "RR", "RL", "LR", "LL", because the 2nd and 5th substrings are not balanced.

Example 3:
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".*/

//ANSWER-->
class Solution {
    public int balancedStringSplit(String s) {
        int balance = 0, count = 0; // balance keeps track of net difference between 'R' and 'L', count stores balanced substrings
        
        for (int j = 0; j < s.length(); j++) { // Iterate through each character in the string
            if (s.charAt(j) == 'R') { // If the character is 'R', increase balance
                balance++;
            } else { // If the character is 'L', decrease balance
                balance--;
            }

            if (balance == 0) { // When balance reaches zero, we found a balanced substring
                count++; // Increment the count of balanced substrings
            }
        }
        return count; // Return the total number of balanced substrings
    }
}

//Time Complexity:O(n)
//Space Complexity:O(1)