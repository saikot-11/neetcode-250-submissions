class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        int j = 0;

        for (int i = 0; i < k; i++) {
            if (freq.get(nums[i]) != null) {
                return true;
            }
            freq.put(nums[i], 1);
        }

        for (int i = k; i < nums.length; i++) {
            if (freq.get(nums[i]) == null) {
                freq.put(nums[i], 1);
            } else if (freq.get(nums[i]) != null) {
                return true;
            }
            if (freq.get(nums[j]) != null) {
                int count = freq.get(nums[j]);
                count -= 1;
                if (count <= 0) {
                    freq.remove(nums[j]);
                } else {
                    freq.put(nums[j], count);
                }
            } else {
                int count = freq.get(nums[j]);
                count += 1;
                freq.put(nums[j], count);
            }
            j++;
        }

        return false;
    }
}