import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        // Count frequency of each lowercase English letter
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }

        // Sort frequencies in ascending order
        Arrays.sort(freq);

        int totalPushes = 0;
        int distinctCharCount = 0;

        // Iterate backward to process most frequent characters first
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) break; // Stop early if no more characters present

            // Each set of 8 distinct characters increments the push multiplier by 1
            int pushMultiplier = (distinctCharCount / 8) + 1;
            totalPushes += freq[i] * pushMultiplier;
            distinctCharCount++;
        }

        return totalPushes;
    }
}