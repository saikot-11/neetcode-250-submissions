class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;

        for (int i = 0; i < Math.pow(2, len); i++) {
            List<Integer> subset = new ArrayList<Integer>();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            res.add(subset);
        }

        return res;
    }
}
