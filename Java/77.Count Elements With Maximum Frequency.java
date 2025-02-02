//QUESTION-->
//

//ANSWER-->

import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        // Create a HashMap to store the frequency of each element
        HashMap<Integer, Integer> temp = new HashMap<>();

        // Count the frequency of each element in the array
        for (int num : nums) {
            temp.put(num, temp.getOrDefault(num, 0) + 1);
        }

        // Find the maximum frequency of any element
        int maxfreq = 0;
        for (int freq : temp.values()) {
            if (freq > maxfreq) {
                maxfreq = freq;
            }
        }

        // Sum up the frequencies of all elements that have the maximum frequency
        int ans = 0;
        for (int freq : temp.values()) {
            if (freq == maxfreq) {
                ans += freq;
            }
        }

        // Return the total sum of the frequencies of the most frequent elements
        return ans;
    }
}


//Time complexity:O(n)
//Space complexity:O(n)