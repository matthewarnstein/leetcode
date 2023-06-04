class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int majority = nums.length/2;

        return nums[majority];
    }
}
