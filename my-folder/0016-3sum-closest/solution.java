class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int prox = Integer.MAX_VALUE;
        int index = -1;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {

                    int sum = nums[i] + nums [j] + nums [k];
                    if (Math.abs(target - sum) < prox) {
                        prox = Math.abs(target - sum);
                        index = i;
                        res = sum;
                    }
                }
            }
        }

        return res;
    }
}
