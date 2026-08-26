class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int majElement = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (majElement != nums[i]) {
                count--;
                if (count == 0) {
                    majElement = nums[i];
                    count = 1;
                }
            } else {
                count++;
            }
        }

        return majElement;
    }
}