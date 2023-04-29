class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        if (target <= nums[low]) {
            return low;
        } else if (target > nums[high]) {
            return high + 1;
        } else {
            return searchSubArray(nums, low, high, target);
        }

    }

    public int searchSubArray(int[] nums, int low, int high, int target) {
        int size = high - low;
        int mid = low + size/2;

        if (nums[mid] == target) {
            return mid;
        } else if (size < 2) {
            if (nums[low] < target && nums[mid] > target)
                return low + 1;
            else if (nums[mid] < target && nums[high] > target) {
                return mid + 1;
            } else {
                return high;
            }
            
        } else if (nums[mid] < target) {
            return searchSubArray(nums, mid, high, target);
        } else {
            return searchSubArray(nums, low, mid, target);
        }
  

    }
}
