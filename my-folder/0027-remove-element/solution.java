class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int k = n;
        int i = 0;
        while (i < n && k > i) {
            if (nums[i] == val) {
                k--;
                for (int j = i; j <  n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            } else {
                i++;
            }
        }

        return k;
    }
}
