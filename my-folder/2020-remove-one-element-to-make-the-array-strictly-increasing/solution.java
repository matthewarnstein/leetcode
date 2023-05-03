import java.lang.*;

class Solution {
    
public boolean canBeIncreasing(int[] nums) {
    int count = 0; // count of non-strictly increasing numbers
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] <= nums[i-1]) { // not strictly increasing
            count++;
            if (count > 1) { // already removed an element
                return false;
            }
            if (i > 1 && nums[i] <= nums[i-2]) { // nums[i] is too small, remove nums[i-1]
                nums[i] = nums[i-1];
            } // else remove nums[i]
        }
    }
    return true;
}

    
}
