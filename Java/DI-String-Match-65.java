//QUESTION-->
//A permutation perm of n + 1 integers of all the integers in the range [0, n] can be represented as a string s of length n where:

// s[i] == 'I' if perm[i] < perm[i + 1], and
// s[i] == 'D' if perm[i] > perm[i + 1].

// Given a string s, reconstruct the permutation perm and return it. If there are multiple valid permutations perm, return any of them.

 

// Example 1:
// Input: s = "IDID"
// Output: [0,4,1,3,2]

// Example 2:
// Input: s = "III"
// Output: [0,1,2,3]

// Example 3:
// Input: s = "DDI"
// Output: [3,2,0,1]

//ANSWER-->

class Solution {
    public int[] diStringMatch(String s) {
        // Initialize the length of the input string
        int n = s.length();
        
        // Two pointers: 'left' starts at 0, and 'right' starts at n
        int left = 0, right = n;

        // Initialize the result array of size n+1
        int[] ans = new int[n + 1];

        // Iterate through the input string 's'
        for (int i = 0; i < n; i++) {
            // If the current character is 'I', assign the current 'left' value
            // to ans[i] and then increment 'left'
            if (s.charAt(i) == 'I') {
                ans[i] = left++;
            }
            // If the current character is 'D', assign the current 'right' value
            // to ans[i] and then decrement 'right'
            else if (s.charAt(i) == 'D') {
                ans[i] = right--;
            }
        }

        // Assign the remaining value of 'left' (or 'right', as they are equal here)
        // to the last position in the result array
        ans[n] = left;

        // Return the result array
        return ans;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)