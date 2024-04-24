class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (palandromic(word))
                return word;
        }
        return "";
    }

    public boolean palandromic (String pal) {
        for (int i = 0; i < pal.length()/2; i++) {
            int j = pal.length() - 1 - i;
            if (pal.charAt(i) != pal.charAt(j))
                return false;
        }
        return true;
    }
}
