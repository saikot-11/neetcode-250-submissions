class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int s1 = 0;
        int s2 = 0;

        while (s1 < word1.length() && s2 < word2.length()) {
            result.append(word1.charAt(s1)).append(word2.charAt(s2));
            s1++;
            s2++;
        }

        while (s1 < word1.length()) {
            result.append(word1.charAt(s1));
            s1++;
        }

        while (s2 < word2.length()) {
            result.append(word2.charAt(s2));
            s2++;
        }

        return result.toString();
    }
}