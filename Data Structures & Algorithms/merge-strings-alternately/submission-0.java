class Solution {
    public String mergeAlternately(String word1, String word2) {
        String result = "";
        int s1 = 0;
        int s2 = 0;

        while (s1 < word1.length() && s2 < word2.length()) {
            result += word1.substring(s1, s1+1) + word2.substring(s2, s2+1);
            s1++;
            s2++;
        }

        while (s1 < word1.length()) {
            result += word1.substring(s1, s1+1);
            s1++;
        }

        while (s2 < word2.length()) {
            result += word2.substring(s2, s2+1);
            s2++;
        }

        return result;
    }
}