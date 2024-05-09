class Solution {
    public void rotate(int[] nums, int k) {
        // i_new = (position + k) % array.length
        // copy[i_new] = array[i]
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int i_new = (i + k) % nums.length;
            copy[i_new] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[i];
        }

    }
}
