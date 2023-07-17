class Solution {
    public boolean increasingTriplet(int[] nums) {
        int[] seq = new int[3];
        int max = Integer.MIN_VALUE;
        int maxPos = -1;
        int min = Integer.MAX_VALUE;
        int minPos = -1;

        if(nums.length < 3)
            return false;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
                maxPos = i;
            }
            if(nums[i] < min) {
                min = nums[i];
                minPos = i;
            }
        }

        if(max - min < 2)
            return false;
        for(int i = 0; i < nums.length - 2; i++) {
            seq[0] = i;
            seq[1] = 0;
            for(int j = i + 1; j < nums.length - 1; j++) {
                if(nums[seq[0]] < nums[j] && nums[j] < max && nums[j] > min) {
                    seq[1] = j;
                    for(int k = j + 1; k < nums.length; k++) {
                        if(nums[seq[1]] < nums[k]) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
