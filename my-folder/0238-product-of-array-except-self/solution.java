class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int[] prefix = new int[nums.length];
        int zeroPos = -1;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 && zeroPos >= 0)
                return prefix;
            else if(nums[i] == 0 && zeroPos < 0) {
                zeroPos = i;
            } else
                prod *= nums[i];
        }

        if(zeroPos >= 0) {
            prefix[zeroPos] = prod;
        } else {
            for(int i = 0; i < nums.length; i++) {
                prefix[i] = prod/nums[i];
            }
        }

        return prefix;

    }
}
