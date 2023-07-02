class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> missing = new ArrayList<List<Integer>>();
        
        if (nums.length == 0) {
            List<Integer> range = new ArrayList<Integer>(2);
            range.add(lower);
            range.add(upper);
            missing.add(range);
            return missing;
        }

        if (nums[0] != lower) {
            List<Integer> range = new ArrayList<Integer>(2);
            range.add(lower);
            range.add(nums[0] - 1);
            missing.add(range);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != (nums[i + 1] - 1) ) {
                System.out.println("nums[i]= "+nums[i]+" :: (nums[i + 1] - 1)= "+(nums[i + 1] - 1));
                List<Integer> range = new ArrayList<Integer>(2);
                range.add(nums[i] + 1);
                range.add(nums[i + 1] - 1);
                missing.add(range);
            }
        }
        if (nums[nums.length - 1] != upper) {
            List<Integer> range = new ArrayList<Integer>(2);
            range.add(nums[nums.length - 1] + 1);
            range.add(upper);
            missing.add(range);
        }

        return missing;
    }
}
