class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean [] isAnagram = new boolean [strs.length];
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if (!isAnagram[i]) {
                List<String> tempRes = new ArrayList<>();
                tempRes.add(strs[i]);
                isAnagram[i] = true;
                for (int j = i + 1; j < strs.length; j++) {
                    if (checkAnagram(strs[i], strs[j])) {
                        tempRes.add(strs[j]);
                        isAnagram[j] = true;
                    }
                }
                res.add(tempRes);
            }
        }

        return res;
    }

    private boolean checkAnagram(String src, String target) {
        if (src.length() != target.length()) {
            return false;
        } 

        int [] freq = new int [26];

        for (int i = 0; i < src.length(); i++) {
            freq[src.charAt(i) - 'a']++;
            freq[target.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
