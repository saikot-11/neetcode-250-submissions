class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            while (start < end && !isAlphaNum(s.charAt(start))) {
                start++;
            }

            while (end >= 0 && start < end && !isAlphaNum(s.charAt(end))) {
                end--;
            }

            if (start > end || Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    private boolean isAlphaNum(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
