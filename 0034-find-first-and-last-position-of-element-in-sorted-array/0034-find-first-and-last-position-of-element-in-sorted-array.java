class Solution {

    public int[] searchRange(int[] nums, int target) {

        int high = 0;
        int low = nums.length - 1;

        int first = -1;
        int last = -1;

        while (high <= low) {

            int mid = high + (low - high) / 2;

            if (nums[mid] == target) {
                first = mid;
                low = mid - 1;
            }
            else if (nums[mid] < target) {
                high = mid + 1;
            }
            else {
                low = mid - 1;
            }
        }
        high = 0;
        low = nums.length - 1;

        while (high <= low) {

            int mid = high + (low - high) / 2;

            if (nums[mid] == target) {
                last = mid;
                high = mid + 1;
            }
            else if (nums[mid] < target) {
                high = mid + 1;
            }
            else {
                low = mid - 1;
            }
        }

        return new int[]{first, last};
    }
}