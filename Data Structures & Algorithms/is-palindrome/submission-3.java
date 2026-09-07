class Solution {
    public boolean isPalindrome(String s) {
        String toLowerCase = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !isAlphaNumeric(toLowerCase.charAt(left))) {
                left++;
            }

            while (right >= 0 && !isAlphaNumeric(toLowerCase.charAt(right))) {
                right--;
            }

            if (left < right && right >= 0 && toLowerCase.charAt(left) != toLowerCase.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isAlphaNumeric(Character ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }
}
