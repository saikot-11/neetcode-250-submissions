class Solution {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    */
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int [] freqCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqCount[s.charAt(i) - 'a']++;
            freqCount[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freqCount[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
