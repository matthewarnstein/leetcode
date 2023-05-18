import java.lang.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int smallerThanCurrent = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    smallerThanCurrent++;
                }
            }
            ans[i] = smallerThanCurrent;
        }
        return ans;
    }
}
