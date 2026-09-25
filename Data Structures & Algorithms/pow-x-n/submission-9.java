/**
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        double res = power(x, Math.abs((long) n));
        return n >= 0 ? res : 1 / res;
    }

    private double power(double x, long n) {
        if (n == 0) {
            return 1;
        }

        double res = power(x, n / 2);
        return n % 2 == 0? res * res : x * res * res;
    }
}
