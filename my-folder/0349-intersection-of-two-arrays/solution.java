class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> res = new HashSet<Integer>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }
        Object[] obj = new Object[res.size()];
        obj = res.toArray(obj);
        int[] arr = new int[obj.length];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)obj[i];

        return arr;
    }
}
