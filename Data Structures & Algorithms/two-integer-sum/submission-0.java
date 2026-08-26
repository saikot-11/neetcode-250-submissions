class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> posMap = new HashMap<>();
        int [] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (posMap.get(diff) != null) {
                result[0] = posMap.get(diff);
                result[1] = i;
                break;
            }
            posMap.put(nums[i], i);
        }

        return result;
    }
}
