class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();
        int res = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        for (int i = 0; i < 32; i++) {
            if (sb.charAt(i) == '1') {
                res |= (1 << (31 - i));
            }
        }

        return res;
    }
}
