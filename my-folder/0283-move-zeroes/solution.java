class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length < 2) {
            return;
        }
        int index = 0;
        int pos = -1;
        while(pos < nums.length - 1) {
            pos = nextNonZero(nums, pos);
            nums[index++] = nums[pos];
        }
        for (int j = index; j < nums.length; j++) {
            nums[j] = 0;
        }

    }

    public int nextNonZero(int[] nums, int start) {
        int i = start + 1;
        while(i < nums.length -1 && nums[i] == 0) {
            i++;
        }
        return i;
    }


    public int[] shiftArray(int[] nums, int pos) {
        int ret = nums[pos];
        for(int i = pos; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = ret;
        return nums;

    }
}
