//QUESTION-->
//You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.

// Return the minimum number of steps to make t an anagram of s.

// An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.

 

// Example 1:

// Input: s = "bab", t = "aba"
// Output: 1
// Explanation: Replace the first 'a' in t with b, t = "bba" which is anagram of s.
// Example 2:

// Input: s = "leetcode", t = "practice"
// Output: 5
// Explanation: Replace 'p', 'r', 'a', 'i' and 'c' from t with proper characters to make t anagram of s.
// Example 3:

// Input: s = "anagram", t = "mangaar"
// Output: 0
// Explanation: "anagram" and "mangaar" are anagrams. 

//ANSWER-->

//******************************************************************************************************************************************

//Approach-1 (Using 2 counters)
class Solution {
    public int minSteps(String s, String t) {
        int n=s.length();

        int[] mp_s=new int[26];   
        int[] mp_t=new int[26];

        for(int i=0;i<n;i++){
            mp_s[s.charAt(i)-'a']++;
            mp_t[t.charAt(i)-'a']++;
        }

        int result=0;

        for(int i=0;i<26;i++){
            int freq_t=mp_t[i];
            int freq_s=mp_s[i];

            if(freq_t<freq_s){
                result += freq_s-freq_t;
            }
        }
        return result;
    }   
}   
//T.C : O(n)
//S.C : O(26) ~ O(1)

//******************************************************************************************************************************************

//Approach-2 (Using 1 counter)
public class Solution {
    public int minSteps(String s, String t) {
        int n = s.length();

        int[] mp = new int[26];

        for (int i = 0; i < n; i++) {
            mp[s.charAt(i) - 'a']++;
            mp[t.charAt(i) - 'a']--;
        }

        int result = 0;

        for (int i = 0; i < 26; i++) {
            result += Math.max(0, mp[i]);
        }

        return result;
    }
}
//T.C : O(n)
//S.C : O(26) ~ O(1)