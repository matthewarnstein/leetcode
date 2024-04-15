class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 3)
            return nums.length;
        int p1 = 0;
        int p2 = 1;
        int k = nums.length;
        int curr = nums[p1];
        int next = nums[p2];

        
        while (p1 < nums.length - 2 && p2 < nums.length - 1) {
            curr = nums[p1];
            next = nums[p2];
            while (curr == next && p2 < k) {
                p2++;
                if (p2 >= nums.length)
                    break;
                else
                    next = nums[p2];
            }
            int n = p2 - p1 - 2;
            if(p2 - p1 > 2) {
                shift(nums, p1 + 2 ,n);
                p1 += 2;
                p2 = p1 + 1;
                k -= n;
            } else {
                p1 = p2;
                p2 = p1 + 1;
            }
            
        }

        return k;
    }

    public void shift(int[] nums, int p, int n) {
        for (int i = p; i < nums.length - n; i++) {
            nums[i] = nums[i + n];
        }
    }

}
