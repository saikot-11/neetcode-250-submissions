class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int [] nums, int left, int right) {
        if (left < right) {
            int pivot = partition(nums, left, right);
            quickSort(nums, left, pivot - 1);
            quickSort(nums, pivot + 1, right);
        }
    }

    private int partition(int [] nums, int left, int right) {
        int pivot = right;
        int ind = left;

        while (ind < right) {
            if (nums[ind] > nums[pivot]) {
                swap (nums, ind, pivot);
            }
            ind++;
        }

        return pivot;
    }

    private void swap (int [] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}