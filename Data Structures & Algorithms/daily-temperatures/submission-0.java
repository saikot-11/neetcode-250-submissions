class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stck = new Stack<>();
        int [] res = new int [temperatures.length];
        int len = temperatures.length;
        res[len - 1] = 0;
        stck.push(len - 1);

        for (int i = len - 2; i >= 0; i--) {
            while (!stck.isEmpty() && temperatures[i] >= temperatures[stck.peek()]) {
                stck.pop();
            }

            if (stck.isEmpty()) {
                res[i] = 0;
            } else {
                res[i] = stck.peek() - i;
            }

            stck.push(i);
        }

        return res;
    }
}
