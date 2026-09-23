class Solution {
    /**
    * Time Complexity: O(n)
    * Space Complexity: O(n)
    */
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        int len = s.length();

        for (int i = 0; i < len; i++) {
            if (isOpeningBraces(s.charAt(i))) {
                stck.push(s.charAt(i));
            } else {
                if (stck.isEmpty()) {
                    return false;
                }

                if (s.charAt(i) == '}' && stck.peek() != '{') {
                    return false;
                }

                if (s.charAt(i) == ']' && stck.peek() != '[') {
                    return false;
                }

                if (s.charAt(i) == ')' && stck.peek() != '(') {
                    return false;
                }

                stck.pop();
            }
        }

        return stck.isEmpty();
    }

    private boolean isOpeningBraces(Character ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}
