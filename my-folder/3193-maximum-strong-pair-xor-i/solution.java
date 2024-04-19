class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (strongPair(nums[i], nums[j])) {
                    int xorPair = nums[i] ^ nums[j];
                    if (xorPair > max)
                        max = xorPair;
                }
            }
        }
        return max;
    }

    public boolean strongPair(int x, int y) {
        if (Math.abs(x - y) <= Math.min(x, y))
            return true;
        else
            return false;
    }
}
