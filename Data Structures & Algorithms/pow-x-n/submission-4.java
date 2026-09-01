class Solution {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (x > 1 && n == -2147483648) {
            return 0;
        }

        if (n < 0) {
            x = 1 / x;
            n *= -1;
        }

        double res = myPow(x, n / 2);

        if (n % 2 == 0) {
            return res * res;
        }

        return x * res * res;
    }
}
