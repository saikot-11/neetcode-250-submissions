class Solution {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(1)
    */
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();

        while (left < right) {
            while (left < right && !isAlphaNum(s.charAt(left))) {
                left++;
            }

            while (left < right && !isAlphaNum(s.charAt(right))) {
                right--;
            }

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNum(Character ch) {
        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ||
        (ch >= '0' && ch <= '9');
    }
}
