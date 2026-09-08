class Solution {
    public int getSum(int a, int b) {
        boolean carry = false;
        int res = 0;

        for (int i = 0; i < 32; i++) {
            boolean aBit = (a & (1 << i)) != 0;
            boolean bBit = (b & (1 << i)) != 0;

            if (aBit && bBit) {
                if (carry) {
                    res |= (1 << i);
                }
                carry = true;
            } else if (!aBit && bBit) {
                if (!carry) {
                    res |= (1 << i);
                } else {
                    carry = true;
                }
            } else if (aBit && !bBit) {
                if (!carry) {
                    res |= (1 << i);
                } else {
                    carry = true;
                }
            } else {
                if (carry) {
                    res |= (1 << i);
                }
                carry = false;
            }

        }

        return res;
    }
}
