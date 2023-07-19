import java.lang.*;

class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1)
            return 0;
    
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 1; i < nums.length; i++) {
            int j = nums.length - 1 - i;
            left[i] = left[i - 1] + nums[i - 1];
            right[j] = right[j + 1] + nums[j + 1];
        }

        for(int i = 0; i < nums.length; i++) {
            if(left[i] == right[i])
                return i;
        }
        return -1;

        //String rStr = Arrays.toString(right);
        //String lStr = Arrays.toString(left);

    }
}
