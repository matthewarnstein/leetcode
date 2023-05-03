class Solution {

    public int strStr(String haystack, String needle) {
        int first = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if (isMatch(haystack.substring(i), needle)) {
                first = i;
                return first;
            }
        }

        return first;
    }

    public boolean isMatch(String str1, String str2) {
        int i = 0;
        while(i < str2.length()) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
            i++;
        }
        return true;
    }
}
