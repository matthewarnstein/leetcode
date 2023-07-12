class Solution {
    public int search(int[] nums, int target) {

        return binarySearch(nums, 0, nums.length - 1, target);

    }


    public int binarySearch(int[] nums, int lower, int upper, int target) {
        int range = upper - lower;
        int pivot = lower + range/2;

        // if(range == 1) {
        //     if(nums[lower] == target)
        //         return lower;
        //     else if(nums[upper] == target)
        //         return upper;
        //     else
        //         return -1;

        // }
        if(range < 2) {
            if(nums[lower] == target)
                return lower;
            else if(nums[upper] == target)
                return upper;
            else
                return -1;
        }
            
        
        if(target < nums[pivot])
            return binarySearch(nums, lower, pivot, target);
        else if(target > nums[pivot])
            return binarySearch(nums, pivot, upper, target);
        else
            return pivot;
        
        //return -1;
       

    }

}







/*
        int l = 0;
        int r = nums.length - 1;
        int p = nums.length/2;
        boolean found = false;
        
        if (nums.length == 0)
            return -1;
        if (nums.length == 1) {
            if (nums[0] == target)
                return 0;
            else
                return -1;
        }
        if (nums.length == 2) {
            if (nums[0] == target)
                return 0;
            else if (nums[1] == target)
                return 1;
            else
                return -1;
        }
    
        while (found == false && r - l > 1) {
            if (r - l <= 1) {
                if (nums[l] == target)
                    return l;
                else if (nums[r] == target)
                    return r; 
            } else {
                if (nums[p] == target)
                    return p;
                else if (target < nums[p]) {
                    r = p;
                    p = l + ((r - l) / 2);
                } else {
                    l = p;
                    p = l + ((r - l) / 2);
                }
            }
        } 
        
        return -1;
*/
