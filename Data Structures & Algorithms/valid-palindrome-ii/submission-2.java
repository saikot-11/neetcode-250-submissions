class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalin(s.substring(0, i) + s.substring(i + 1)) || isPalin(s.substring(0, j) + s.substring(j + 1));
            }

            i++;
            j--;
        }

        return true;
    }

    private boolean isPalin (String str) {
        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}