class Solution {
    public boolean validPalindrome(String s) {
        boolean isPalin = false;
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(0,i) + s.substring(i+1);
            isPalin |= checkPalindrome(str);
        }
        return isPalin;
    }

    private boolean checkPalindrome(String src) {
        int i = 0;
        int j = src.length() - 1;

        while (i < j) {
            if (src.charAt(i) != src.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}