class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            ans[j+1] = nums[i+n];
            j+=2;
        }

        return ans;
    }
}
