class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }

        String comPrefix = "";

        comPrefix = findCommonPrefix(strs[0], strs[1]);

        for (int i = 2; i < strs.length; i++) {
            comPrefix = findCommonPrefix(comPrefix, strs[i]);
        }

        return comPrefix;
    }

    private String findCommonPrefix(String src, String dest) {
        String prefix = "";

        for (int i = 0; i < src.length(); i++) {
            if (i >= dest.length()) {
                return prefix;
            }
            if (src.charAt(i) != dest.charAt(i)) {
                return prefix;
            }
            prefix += src.charAt(i);
        }

        return prefix;
    }
}