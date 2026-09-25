/**
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public boolean isHappy(int n) {
        int fast = n;
        int slow = n;

        while (fast != 1) {
            fast = digitSquareSum(digitSquareSum(fast));
            slow = digitSquareSum(slow);

            if (fast != 1 && fast == slow) {
                return false;
            }
        }

        return true;
    }

    private int digitSquareSum(int n) {
        int digitSum = 0;

        while (n > 0) {
            int digit = n % 10;
            digitSum += digit * digit;
            n /= 10;
        }

        return digitSum;
    }
}
