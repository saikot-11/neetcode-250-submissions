class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, target, result, new ArrayList<>(), 0);
        return result;
    }

    private void backtrack(int [] nums, int target, List<List<Integer>> result, List<Integer> temp, int i) {
        if (target < 0 || i >= nums.length) {
            return;
        }
        
        if (target == 0) {
            List<Integer> res = new ArrayList<>();
            res.addAll(temp);
            result.add(res);
            return;
        }

        temp.add(nums[i]);
        backtrack(nums, target - nums[i], result, temp, i);
        temp.remove(temp.size() - 1);
        backtrack(nums, target, result, temp, i + 1);
    }
}
