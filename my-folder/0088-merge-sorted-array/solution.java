class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        while (i < m + n && j < n) {
            if (i >= m + j) {
                nums1[i] = nums2[j];
                i++;
                j++;
            } else if (nums2[j] < nums1[i]) {
                bubble(nums1, i);
                nums1[i] = nums2[j];
                i++;
                j++;
            } else {
                i++;
            }
        }
    }

    public void bubble(int[] nums, int pos) {
        for (int i = nums.length - 1; i > pos; i--) {
            nums[i] = nums[i - 1];
        }
        return;
    }
}
