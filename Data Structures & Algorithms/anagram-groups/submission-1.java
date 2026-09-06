class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            int [] freq = new int [26];

            for (Character ch : strs[i].toCharArray()) {
                freq[ch - 'a']++;
            }

            String key = Arrays.toString(freq);
            if (map.containsKey(key)) {
                List<String> s = map.get(key);
                s.add(strs[i]);
                map.put(key, s);
            } else {
                List<String> s = new ArrayList<>();
                s.add(strs[i]);
                map.put(key, s);
            }
        }

        for (String key : map.keySet()) {
            res.add(map.get(key));
        }

        return res;
    }
}
