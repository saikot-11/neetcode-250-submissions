class Solution {
    public void rotate(int[] nums, int k) {
        // int [] res = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     int j = (i + k) % nums.length;
        //     res[j] = nums[i];
        // }

        // for (int i = 0; i <nums.length; i++) {
        //     nums[i] = res[i];
        // }

        int len = nums.length;
        k = k % len;

        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);

    }

    private void reverse (int [] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
}