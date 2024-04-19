class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String sub = s.substring(i, i + 3);
            if (isGoodSubstring(sub))
                count++;
        }

        return count;
    }

    public boolean isGoodSubstring(String str) {
        if(str.charAt(0) != str.charAt(1) && 
            str.charAt(1) != str.charAt(2) && 
            str.charAt(0) != str.charAt(2))
            return true;
        else
            return false;
    }
}
