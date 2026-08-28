class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (isOpeningBraces(ch)) {
                stck.push(ch);
            } else {
                if (stck.isEmpty()) {
                    return false;
                }
                if (stck.peek() == '(' && ch != ')') {
                    return false;
                }
                if (stck.peek() == '{' && ch != '}') {
                    return false;
                }
                if (stck.peek() == '[' && ch != ']') {
                    return false;
                }
                stck.pop();
            }
        }

        return stck.isEmpty() ? true : false;
    }

    private boolean isOpeningBraces(Character ch) {
        return ch == '{' || ch == '[' || ch == '(';
    }
}
