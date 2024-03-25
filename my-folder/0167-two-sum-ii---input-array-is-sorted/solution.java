class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (j - i > 1) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                break;
            }
        }
        i++;
        j++;
        int[] res = new int[2];
        res[0] = i;
        res[1] = j;

        return res;
    }
}
