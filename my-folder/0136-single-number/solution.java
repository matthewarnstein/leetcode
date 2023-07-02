import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        return solveMethod2(nums);
    }

    public int solveMethod2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : nums) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        Set<Integer> keys = map.keySet();
        for(Integer key : keys) {
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }



    public int solveMethod1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i+=2) {
            if (nums[i] == nums[i + 1])
                continue;
            else {
                if (nums[i + 1] == nums[i + 2]) {
                    return nums[i];
                } else {
                    return nums[i + 1];
                }
            }
        }
        return nums[nums.length - 1];
    }
}
