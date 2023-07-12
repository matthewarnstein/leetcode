class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] merged = new char[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        boolean word1Turn = true;
        while(i < arr1.length && j < arr2.length) {
            if(k % 2 == 0) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        if(i < arr1.length) {
            while(i < arr1.length) {
                merged[k++] = arr1[i++];
            }
        }
        if(j < arr2.length) {
            while(j < arr2.length) {
                merged[k++] = arr2[j++];
            }
        }

        return new String(merged);

    }
}
