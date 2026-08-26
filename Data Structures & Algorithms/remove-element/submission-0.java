class Solution {
    public int removeElement(int[] nums, int val) {
        int i = -1;
        int count = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                count++;
                i++;
                nums[i] = nums[j];
            }
        }

        return count;
    }
}