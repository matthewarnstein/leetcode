class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> numsSet1 = new HashSet<Integer>();
        Set<Integer> numsSet2 = new HashSet<Integer>();
        List<Integer> numsList1 = new ArrayList<Integer>();
        List<Integer> numsList2 = new ArrayList<Integer>();

        for(int num : nums1) {
            numsSet1.add(num);
        }

        for(int num : nums2) {
            numsSet2.add(num);
        }

        for(int num : nums1) {
            if(!numsSet2.contains(num) && !numsList1.contains(num)) {
                numsList1.add(num);
            }
        }

        for(int num : nums2) {
            if(!numsSet1.contains(num) && !numsList2.contains(num)) {
                numsList2.add(num);
            }
        }

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(numsList1);
        res.add(numsList2);

        return res;
    }
}
