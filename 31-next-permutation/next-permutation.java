class Solution {
    public void nextPermutation(int[] nums) {

        int n = nums.length;
        int i = n - 2;

        // Step 1: find first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {

            int j = n - 1;

            // Step 2: find just larger element
            while (nums[j] <= nums[i]) {
                j--;
            }

            // swap
            swap(nums, i, j);
        }

        // Step 3: reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
