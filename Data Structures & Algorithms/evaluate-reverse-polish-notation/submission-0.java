class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stck = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (!isOperator(tokens[i])) {
                stck.push(Integer.parseInt(tokens[i]));
                continue;
            }
            int firstOperand = stck.pop();
            int secondOperand = stck.pop();

            if ("+".equals(tokens[i])) {
                int res = firstOperand + secondOperand;
                stck.push(res);
            } else if ("-".equals(tokens[i])) {
                int res = secondOperand - firstOperand;
                stck.push(res);
            } else if ("*".equals(tokens[i])) {
                int res = firstOperand * secondOperand;
                stck.push(res);
            } else {
                int res = secondOperand / firstOperand;
                stck.push(res);
            }
        }

        return stck.peek();
    }

    private boolean isOperator(String str) {
        return "+".equals(str) || "-".equals(str) || "*".equals(str) || "/".equals(str);
    }
}
