import java.lang.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] sect = new int[nums1.length];
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                sect[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }

        Arrays.copyOf(sect, k);
        return Arrays.copyOf(sect, k);



        
    }
}
