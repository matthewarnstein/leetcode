class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowSize = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            if (sum >= target) {
                while (sum >= target) {
                    if ((sum - nums[start]) >= target) {
                        sum -= nums[start];
                        start++;
                    } else {
                        break;
                    }
                }
                int size = (end + 1) - start;
                if (size < windowSize) {
                    windowSize = size;
                }
            }

        }

        if (windowSize == Integer.MAX_VALUE)
            windowSize = 0;
        return windowSize;
    }
}
