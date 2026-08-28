class Solution {
    public int calPoints(String[] operations) {
        int totalScore = 0;
        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {
            if (!isOperation(operations[i])) {
                Integer in = Integer.parseInt(operations[i]);
                scores.add(in);
            } else {
                applyOperation(scores, operations[i]);
            }
        }

        for (Integer in : scores) {
            totalScore += in;
        }

        return totalScore;
    }

    private boolean isOperation(String str) {
        return "+".equals(str) || "C".equals(str) || "D".equals(str);
    }

    private void applyOperation(List<Integer> scores, String str) {
        if ("+".equals(str)) {
            int second = scores.get(scores.size() - 1);
            int first = scores.get(scores.size() - 2);
            scores.add(second + first);
        } else if ("C".equals(str)) {
            scores.remove(scores.size() - 1);
        } else if ("D".equals(str)) {
            int len = scores.size() - 1;
            scores.add(scores.get(len) * 2);
        }
    }
}