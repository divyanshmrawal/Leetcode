//QUESTION-->
//You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

// Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
// Align the substitution table with the regular English alphabet.
// Each letter in message is then substituted using the table.
// Spaces ' ' are transformed to themselves.
// For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
// Return the decoded message.

//Example 1:
// Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
// Output: "this is a secret"
// Explanation: The diagram above shows the substitution table.
// It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".

// Example 2:
// Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
// Output: "the five boxing wizards jump quickly"
// Explanation: The diagram above shows the substitution table.
// It is obtained by taking the first appearance of each letter in "eljuxhpwnyrdgtqkviszcfmabo".
//ANSWER-->

class Solution {
    public String decodeMessage(String key, String message) {
        String temp="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder ();

        HashMap<Character,Character> map=new HashMap<>();
        
        int count=0;
        for(int i=0;i<key.length();i++){
            if(!map.containsKey(key.charAt(i)) && key.charAt(i) != ' '){
                map.put(key.charAt(i) , temp.charAt(count));
                count++;
            }
        }

        for(int j=0;j<message.length();j++){
            if(map.containsKey(message.charAt(j))){
                sb.append(map.get(message.charAt(j)));
            }

            if(message.charAt(j)==' '){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)