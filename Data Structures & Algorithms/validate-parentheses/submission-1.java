class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();

        for (Character ch : s.toCharArray()) {
            if (isOpeningBraces(ch)) {
                stck.push(ch);
            } else {
                if (stck.isEmpty()) {
                    return false;
                } else {
                    if (ch == ')' && stck.peek() != '(') {
                        return false;
                    } else if (ch == '}' && stck.peek() != '{') {
                        return false;
                    } else if (ch == ']' && stck.peek() != '[') {
                        return false;
                    } else {
                        stck.pop();
                    }
                }
            }
        }

        return stck.isEmpty();
    }

    private boolean isOpeningBraces (Character ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }
}
