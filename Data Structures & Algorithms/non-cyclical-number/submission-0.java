class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        while (fast != 1 && sumOfSquares(fast) != 1) {
            fast = sumOfSquares(sumOfSquares(fast));
            slow = sumOfSquares(slow);

            if (fast == slow) {
                return false;
            }
        }

        return true;
    }

    private int sumOfSquares(int digit) {
        int sum = 0;
        while (digit > 0) {
            int n = digit % 10;
            sum += n * n;
            digit /= 10;
        }
        return sum;
    }
}
