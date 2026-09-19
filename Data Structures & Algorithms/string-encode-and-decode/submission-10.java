class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        String enc = "";

        for (int i = 0; i < strs.size(); i++) {
            int len = strs.get(i).length();
            sb.append(len).append(",");
            enc += strs.get(i);
        }

        return sb.toString() + "#" + enc;
    }

    public List<String> decode(String str) {
        int firstOccurrence = str.indexOf("#");
        String [] lens = str.substring(0, firstOccurrence).split(",");
        String strs = str.substring(firstOccurrence + 1);
        List<String> res = new ArrayList<>();

        for (int i = 0, j = 0; i < lens.length; i++) {
            if (lens[i].length() > 0) {
                int len = Integer.parseInt(lens[i]);
                res.add(strs.substring(j, j + len));
                j += len;
            }
        }

        return res;
    }
}
