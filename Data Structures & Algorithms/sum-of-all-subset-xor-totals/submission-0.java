class Solution {
    public int subsetXORSum(int[] nums) {
        int len = nums.length;
        int total = 0;

        for (int i = 1; i < Math.pow(2, len); i++) {
            int xor = 0;
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    xor ^= nums[j];
                }
            }
            total += xor;
        }

        return total;
    }
}