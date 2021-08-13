class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        double median;
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                nums[k] = nums1[i];
                i++;
                k++;
            } else {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        }
        if (j < nums2.length && i >= nums1.length) {
            while (j < nums2.length) {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        } else {
            while (i < nums1.length) {
                nums[k] = nums1[i];
                i++;
                k++;
            }
        }
        
        if (k % 2 == 1) {
            int index = k/2;
            median = (double)nums[index];
        } else {
            int index1 = k/2 - 1;
            int index2 = index1 + 1;
            median = ((double)nums[index1] + (double)nums[index2])/2;
        }
        
        return median;
    }
}
