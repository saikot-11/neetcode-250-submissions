class Solution {
    public int reverseBits(int n) {
        int x = 0;
        for (int i = 0; i <= 15; i++) {
            boolean isLeftSet = (n & (1 << (31 - i))) != 0;
            boolean isRightSet = (n & (1 << i)) != 0;

            if (isLeftSet) {
                x = x | (1 << i);
            } else {
                x = x & ~(1 << i);
            }

            if (isRightSet) {
                x = x | (1 << (31 - i));
            } else {
                x = x & ~(1 << (31 - i));
            }
        }

        return x;
    }
}
